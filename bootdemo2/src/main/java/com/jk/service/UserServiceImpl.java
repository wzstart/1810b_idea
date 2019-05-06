package com.jk.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.bean.Tree;
import com.jk.bean.User;
import com.jk.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/28 9:56
 * @Created by wuzhuang
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Reference
    TreeService treeService;

    public List<Tree> getTreeByPro() {

        return treeService.getTree();
    }


    @Transactional(readOnly = true)
    @Override
    public List<User> findUserById(Integer id) {

        return userMapper.findUserById(id);
    }


    @Override
    public User getUserByUsernamePwd(User user) {
        return userMapper.getUserByUsernamePwd(user);
    }

    @Transactional(rollbackFor = NullPointerException.class)
    public List<User> update(Integer id) {

        return userMapper.findUserById(id);
    }
}
