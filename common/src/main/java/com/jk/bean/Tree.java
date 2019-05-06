package com.jk.bean;

import java.io.Serializable;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/30 10:05
 * @Created by wuzhuang
 */

public class Tree implements Serializable {

    private String name;

    private String pid;


    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
