package com.kkb.bean;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-12-23 20:22
 */
public class Son extends Parent {

    @Override
    public void study() {
        System.out.println("1. son 学习的不刻苦");
    }

    @Override
    public void aiQing() {
        System.out.println("2. son 浪漫的爱情");
    }

    //@Override
    //public void renSheng() {
    //    this.study();
    //    this.aiQing();
    //    System.out.println();
    //}
}
