package com.jk.dao;

import com.jk.bean.User;

import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/27 12:12
 * @Created by wuzhuang
 */
public interface UserDao {

    public List<User> getUserById(Integer id);
}
