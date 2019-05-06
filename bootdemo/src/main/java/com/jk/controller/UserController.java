package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/28 8:52
 * @Created by wuzhuang
 * <p>
 * RestController 和 Controller?
 * <p>
 * RestController 会在类的每一个方法上加上ResponseBody
 */
@RestController
public class UserController {


    @RequestMapping("hello")
    public String hello() {

        return "欢迎你 springboot";
    }

}
