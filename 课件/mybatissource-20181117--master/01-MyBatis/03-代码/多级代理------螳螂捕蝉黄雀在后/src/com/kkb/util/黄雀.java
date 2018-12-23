package com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class 黄雀 implements InvocationHandler {

	  private Object proxy1;//监听小婵的监听对象
	  
	public 黄雀(Object proxy1) {
		
		this.proxy1 = proxy1;
	}

	@Override                         //invoke
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		   //主要业务 螳螂军吃小婵,让一级代理对象通知螳螂君，小蝉吃树汁
		   method.invoke(proxy1, args);
		    次要业务();
		return null;
	}
	
	private  void 次要业务(){
		System.out.println("黄雀吃螳螂君");
	}

}
