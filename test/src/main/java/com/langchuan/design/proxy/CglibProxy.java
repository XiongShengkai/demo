package com.langchuan.design.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author: kevin.xiong
 * @description: cglib动态代理类 如果目标对象没有实现接口，则采用cglib动态代理；
 *                 spring-AOP是典型的cglib动态代理案例
 * @date:2018/9/28 15:40
 */
public class CglibProxy implements MethodInterceptor {

  private Object target;

  public CglibProxy(Object target) {
    this.target = target;
  }

  /** 给目标对象创建一个代理对象*/
  public Object getProxyInstance(){
    //1.工具类
    Enhancer en = new Enhancer();
    //2.设置父类
    en.setSuperclass(target.getClass());
    //3.设置回调函数
    en.setCallback(this);
    //4.创建子类(代理对象)
    return en.create();
  }

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    // 执行目标对象的方法
    Object returnValue = method.invoke(target, objects);
    return returnValue;
  }
}
