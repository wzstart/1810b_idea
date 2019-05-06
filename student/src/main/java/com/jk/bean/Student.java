package com.jk.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/4/24 14:03
 * @Created by wuzhuang
 */

@Data
public class Student implements BeanNameAware, BeanFactoryAware {

    String name;

    Integer age;

    @Override
    public void setBeanName(String s) {
        System.out.println(" BeanNameAware == >" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory ==> " + beanFactory);
    }

    public void initBean() {
        System.out.println("student 类创建了");
    }

}
