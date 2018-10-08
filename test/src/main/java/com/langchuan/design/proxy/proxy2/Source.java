package com.langchuan.design.proxy.proxy2;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 10:27
 */
public class Source implements Sourceable {

  @Override
  public void method() {
    System.out.println("the original method!");
  }
}
