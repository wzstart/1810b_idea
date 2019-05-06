package com.jk.controller;

import com.jk.bean.Tree;
import com.jk.bean.User;
import com.jk.service.UserService;
import com.jk.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/28 9:31
 * @Created by wuzhuang
 * <p>
 * <p>
 * 判断用户名和密码是否正确
 * 正确
 * 判断是否记住密码
 * <p>
 * 是-->
 * 用户名和密码都存到cookie中去
 * <p>
 * 否-->
 * <p>
 * 清除cookie
 * <p>
 * 错误
 * 提示错误
 */

@Controller
public class UserController {




    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("getUser")
    public List<User> getUserById(Integer userId) {

        //alt+回车
        //.var
        List<User> user = userService.findUserById(userId);

        return user;
    }

    @RequestMapping("toLogin")
    public String index(HttpServletRequest request, Model model) {

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(Constant.cookieNamePwd)) {
                    String value = cookie.getValue();//保存的是用户名+/分隔符+密码
                    if (value != null) { //str = 123.456  [123,456]
                        String[] split = value.split(Constant.splitChart);

                        model.addAttribute("username", split[0]);
                        model.addAttribute("password", split[1]);
                    }
                }
            }
        }
        return "login";
    }


    @RequestMapping("login")
    public String login(HttpServletResponse response, User user, Model model, HttpSession session) {


        //判断用户名和密码是否正确
        User userFromDb = userService.getUserByUsernamePwd(user);

        if (userFromDb != null) {

            //正确 判断是否记住密码
            if (user.getRemPwd() != null) {
                //是-->  用户名和密码都存到cookie中去

                Cookie cookie = new Cookie(Constant.cookieNamePwd, user.getUsername() + Constant.splitChart + user.getPassword());

                cookie.setMaxAge(604800);

                response.addCookie(cookie);
            } else {
                //否--> 清除cookie
                Cookie cookie = new Cookie(Constant.cookieNamePwd, "");

                cookie.setMaxAge(0);

                response.addCookie(cookie);
            }
            session.removeAttribute("msg");
        } else {
            //密码输入错误 TODO

            session.setAttribute("msg", "密码输入错误");
            Cookie cookie = new Cookie(Constant.cookieNamePwd, "");

            cookie.setMaxAge(0);

            response.addCookie(cookie);

            return "redirect:toLogin";
        }


        return "index";
    }

    @ResponseBody
    @RequestMapping("getTree")
    public List<Tree> getTree() {

        return userService.getTreeByPro();
    }
}
