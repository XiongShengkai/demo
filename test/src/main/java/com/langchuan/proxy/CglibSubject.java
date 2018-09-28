package com.langchuan.proxy;

/**
 * @author: kevin.xiong
 * @description: 目标对象类  Cglib动态代理
 * @date:2018/9/28 15:39
 */
public class CglibSubject {

  public void visit(){
    System.out.println("我是cglib动态代理");
  }
}
