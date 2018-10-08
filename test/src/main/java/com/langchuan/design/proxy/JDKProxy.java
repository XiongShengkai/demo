package com.langchuan.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: kevin.xiong
 * @description:  JDK动态代理类
 *                  如果目标对象实现了接口，则采用jdk动态代理
 * @date:2018/9/28 15:31
 */
public class JDKProxy implements InvocationHandler{

  private Object target;

  public JDKProxy(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result = method.invoke(target, args);
    return result;
  }
}
