package com.jk.server.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/18 8:45
 * @Created by wuzhuang
 */
@RestController
public class ClientController {

    @Value("${obj}") // git配置文件里的key
            String message = "default";

    @RequestMapping(value = "/hi")
    public String hi() {

        return message;
    }
}
