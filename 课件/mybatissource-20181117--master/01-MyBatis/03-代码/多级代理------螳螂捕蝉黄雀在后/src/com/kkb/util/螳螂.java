package com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.kkb.service.BaseService;

public class 螳螂 implements InvocationHandler {

	 private BaseService obj;//小蝉
	 
	 
	//invoke方法就是 螳螂类的主要业务方法，也是需要被监听方法
	@Override
	public Object invoke(Object listener, Method method, Object[] args) throws Throwable {
		//蝉吃树汁
		method.invoke(obj, args);
		次要业务();
		return null;
	}
	
	public 螳螂(BaseService param) {
		
		this.obj = param;
	}

	private void 次要业务(){
		System.out.println("螳螂吃小婵");
	}

}
