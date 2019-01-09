package com.kkb.service.com.kkb.util;

import com.kkb.service.BaseService;
import com.kkb.service.com.kkb.serviceImpl.Person;

import java.lang.reflect.InvocationHandler;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-02 22:31
 */
public class TestMain {

    public static void main(String[] args) {

        BaseService target = new Person();
        InvocationHandler agent = new Agent(target);

        //BaseService proxy = (BaseService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        // target.getClass().getInterfaces(), agent);
        //proxy.eatting("鸡蛋");

        //简单代理
        //ProxyFactory<BaseService> proxyFactory = ProxyFactory.getInstance();
        //BaseService proxy = proxyFactory.newInstance(target.getClass(), agent);
        //proxy.eatting("肉");

        //多级代理
        ProxyFactory<BaseService> proxyFactory1 = ProxyFactory.getInstance();
        BaseService proxy1 = proxyFactory1.newInstance(target.getClass(), agent);
        InvocationHandler agent2 = new Agent1(proxy1);
        BaseService proxy2 = proxyFactory1.newInstance(proxy1.getClass(), agent2);
        proxy2.eatting("肉");
    }


}
