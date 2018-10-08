package com.langchuan.design.decorator;

/**
 * @author: kevin.xiong
 * @description:  被装饰类
 * @date:2018/9/30 10:05
 */
public class Source implements Sourceable {

  @Override
  public void method() {
    System.out.println("the original method!");
  }
}
