package com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.kkb.service.BaseService;
import com.kkb.serviceImpl.蝉;

public class BeanFactory {

	public static BaseService newInstance(Class classFile){
		
		    //1.创建一个真实的小蝉
		    BaseService    真实小蝉 =  new 蝉();
		    //2.创建代理实现类对象  螳螂君
		    InvocationHandler 螳螂君 = new 螳螂(真实小蝉);
		    
		    //3.向JVM所要代理对象（监听对象） 监听小婵何时吃树脂，通知螳螂君
		    Class array[]={BaseService.class};
		   BaseService proxy1=  (BaseService) Proxy.newProxyInstance(classFile.getClassLoader(), array, 螳螂君);
	      
		    //4.创建代理实现类  黄雀君
		   InvocationHandler 黄雀君 = new 黄雀(proxy1);
		   BaseService proxy2 =(BaseService) Proxy.newProxyInstance(classFile.getClassLoader(), array, 黄雀君);
		   return proxy2;
	}
}
