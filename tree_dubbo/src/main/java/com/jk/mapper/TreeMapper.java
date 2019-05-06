package com.jk.mapper;

import com.jk.bean.Tree;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/30 9:00
 * @Created by wuzhuang
 */
public interface TreeMapper {

    @Select("select * from t_permission")
    public List<Tree> getTree();
}
