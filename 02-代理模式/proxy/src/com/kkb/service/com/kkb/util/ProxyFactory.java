package com.kkb.service.com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-02 22:54
 */
public class ProxyFactory<T> {

    private static ProxyFactory proxyFactory;

    public static ProxyFactory getInstance() {
        if (proxyFactory == null) {
            proxyFactory = new ProxyFactory();
        }
        return proxyFactory;
    }

    public T newInstance(Class targer, InvocationHandler agent) {
       T proxy =  (T)Proxy.newProxyInstance(targer.getClassLoader(), targer.getInterfaces(), agent);
        return proxy;
    }






}
