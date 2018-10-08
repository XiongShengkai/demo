package com.langchuan.design.proxy;

/**
 * @author: kevin.xiong
 * @description:目标(真实)对象类      委托类
 * @date:2018/9/28 15:10
 */
public class RealSubject implements Subject {

  @Override
  public void visit(int channel) {
    if (channel==1){
      System.out.println("我是静态委托类");
    }else {
      System.out.println("我是动态委托类");
    }
  }
}
