package com.kkb.service.com.kkb.serviceImpl;

import com.kkb.service.BaseService;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-02 22:26
 */
public class Person implements BaseService {

    @Override
    public void eatting(String food) {
        System.out.println("吃ing " + food + "...");
    }

    @Override
    public void wcing() {
        System.out.println("wcing...");
    }
}
