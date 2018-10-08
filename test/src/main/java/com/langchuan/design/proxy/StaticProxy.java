package com.langchuan.design.proxy;

/**
 * @author: kevin.xiong
 * @description:静态代理类
 * @date:2018/9/28 15:14
 */
public class StaticProxy implements Subject{

  private RealSubject subject;

  public StaticProxy(RealSubject subject) {
    this.subject = subject;
  }

  @Override
  public void visit(int channel) {
    subject.visit(channel);
  }
}
