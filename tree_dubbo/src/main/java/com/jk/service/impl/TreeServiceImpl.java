package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.bean.Tree;
import com.jk.mapper.TreeMapper;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/30 9:00
 * @Created by wuzhuang
 */
@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    TreeMapper treeMapper;

    @Override
    public List<Tree> getTree() {
        return treeMapper.getTree();
    }
}
