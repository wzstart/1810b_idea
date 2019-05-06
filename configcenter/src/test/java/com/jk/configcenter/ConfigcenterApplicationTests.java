package com.jk.configcenter;

import org.junit.Test;

public class ConfigcenterApplicationTests {

    @Test
    public void contextLoads() {

        String a = "Holle world fell shuai aab";

        //单词的个数
        String[] chs = a.split(" ");

        int length = chs.length;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chs[i]);
            for (int j = 0; j < length - i; j++) {
                sb.append("#");
            }
        }
        System.out.println(sb);
    }


}
