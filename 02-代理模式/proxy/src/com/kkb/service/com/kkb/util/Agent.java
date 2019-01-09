package com.kkb.service.com.kkb.util;

import com.kkb.service.BaseService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-02 22:32
 */
public class Agent implements InvocationHandler {

    //被代理对象
    BaseService obj;

    public Agent(BaseService obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.wash();
        method.invoke(obj, args);
        return null;
    }

    private void wash() {
        System.out.println("先洗手。。。");
    }
}
