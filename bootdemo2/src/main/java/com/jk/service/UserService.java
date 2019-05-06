package com.jk.service;

import com.jk.bean.Tree;
import com.jk.bean.User;

import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/28 9:56
 * @Created by wuzhuang
 */
public interface UserService {

    public List<User> findUserById(Integer id);

    User getUserByUsernamePwd(User user);

    List<Tree> getTreeByPro();
}
