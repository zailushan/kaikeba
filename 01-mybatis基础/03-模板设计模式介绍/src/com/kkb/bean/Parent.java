package com.kkb.bean;

/**
 * @description: 父类
 * @author: cwenlong
 * @date: 2018-12-23 20:13
 */
public class Parent {

    public void study() {
        System.out.println("1.年轻时多学习");
    }

    public void toJob() {
        System.out.println("2.外出工作");
    }

    public void aiQing() {
        System.out.println("3.结婚生子");
    }

    public final void renSheng() {
        this.study();
        this.toJob();
        this.aiQing();
    }
}
