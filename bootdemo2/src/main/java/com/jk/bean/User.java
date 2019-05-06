package com.jk.bean;

import lombok.Data;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/28 9:12
 * @Created by wuzhuang
 */
@Data
public class User {

    private String username;

    private String email;

    private String password;

    private String remPwd;

    private Integer age;

   public String run() {
        System.out.println("123");
        username = "123.com";
        return username;
    }
}
