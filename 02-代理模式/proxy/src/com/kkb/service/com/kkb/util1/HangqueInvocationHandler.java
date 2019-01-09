package com.kkb.service.com.kkb.util1;

import com.kkb.service.BaseService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-01-05 16:15
 */
public class HangqueInvocationHandler implements InvocationHandler {

    private BaseService tangLang;

    public HangqueInvocationHandler(BaseService tangLang) {
        this.tangLang = tangLang;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(tangLang,args);
        this.toDo();
        return null;
    }

    private void toDo() {
        System.out.println("黄雀在后...");
    }

}
