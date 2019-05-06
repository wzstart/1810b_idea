package com.jk.util;

import com.jk.bean.User;
import org.junit.Test;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/30 14:55
 * @Created by wuzhuang
 */
public class Test01 {

    @Test
    public void test01() {
        User user = new User() {
            int i = 0;

            {
                run();
            }
        };

        System.out.println();
    }
}
