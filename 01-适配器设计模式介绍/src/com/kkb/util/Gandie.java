package com.kkb.util;

import com.kkb.service.XueShengShouZe;

/**
 * @description:
 * @author: cwenlong
 * @date: 2018-12-22 15:28
 */
public abstract class Gandie implements XueShengShouZe{

    @Override
    public void parentsSign() {
        System.out.println("家长签字");
    }

    /**
     * 抽象类对于接口的方法，可以不实现，
     * 在这个情况下，可以把该抽象类理解为 继承XueShengShouZe的子接口，
     * 所以 Gandie抽象类中 对于 XueShengShouZe 接口中不想实现的方法 play()，
     * 不需要实现和申明或定义， 因为把该抽象类Gandie理解为接口的话，
     * 它就从XueShengShouZe接口中继承了play() 这个方法，
     * 但是，该抽象类Gandie的子类(非抽象类)，就一定要实现 play()方法了。
     */

}
