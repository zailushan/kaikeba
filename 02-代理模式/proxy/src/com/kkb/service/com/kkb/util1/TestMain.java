package com.kkb.service.com.kkb.util1;

import com.kkb.service.BaseService;
import com.kkb.service.com.kkb.serviceImpl.Person;
import com.kkb.service.com.kkb.util.ProxyFactory;

import java.lang.reflect.InvocationHandler;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-05 16:13
 */
public class TestMain {

    public static void main(String[] args) {

        BaseService target = new Person();
        InvocationHandler handler1 = new TanglangInvocationHandler(target);
        ProxyFactory<BaseService> proxyFactory = ProxyFactory.getInstance();
        BaseService proxy = proxyFactory.newInstance(target.getClass(), handler1);
        //proxy.eatting("树汁");

        InvocationHandler handler2 = new HangqueInvocationHandler(proxy);
        BaseService proxy1 = proxyFactory.newInstance(proxy.getClass(), handler2);
        proxy1.eatting("树汁");




    }


}
