package com.jk.boot;

import com.jk.bean.User;
import com.jk.dao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@MapperScan("com.jk.**.dao")
@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Autowired
    UserDao userDao;

    @ResponseBody
    @RequestMapping("index")
    public List<User> index() {

        List<User> user = userDao.getUserById(1);

        return user;
    }

    @RequestMapping("index2")
    public String index(String name) {

        return name;
    }
}
