package com.langchuan.proxy;

import java.lang.reflect.Proxy;
import org.junit.Test;

/**
 * @author: kevin.xiong
 * @description:测试类
 * @date:2018/9/28 15:21
 */
public class Client {

  @Test
  public void testStaticProxy(){
    StaticProxy proxySubject = new StaticProxy(new RealSubject());
    proxySubject.visit(1);
  }

  @Test
  public void testJDKProxy(){
    RealSubject realSubject = new RealSubject();
    JDKProxy proxy = new JDKProxy(realSubject);
    ClassLoader classLoader = realSubject.getClass().getClassLoader();

    Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
    subject.visit(2);
  }

  @Test
  public void testCglibProxy(){
    //目标对象
    CglibSubject target = new CglibSubject();
    //代理对象
    CglibSubject proxy = (CglibSubject) new CglibProxy(target).getProxyInstance();
    //执行代理对象方法
    proxy.visit();
  }
}
