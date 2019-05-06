package com.jk.dao;

import com.jk.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/28 9:12
 * @Created by wuzhuang
 */
public interface UserMapper {

    public List<User> findUserById(Integer id);

    @Select("select * from t_user where username=#{username} and password=#{password}")
    User getUserByUsernamePwd(User user);
}
