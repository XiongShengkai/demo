package com.langchuan.design.decorator;

/**
 * @author: kevin.xiong
 * @description: 装饰类
 * @date:2018/9/30 10:06
 */
public class Decorator implements Sourceable {

  private Sourceable source;

  public Decorator(Sourceable source) {
    this.source = source;
  }

  @Override
  public void method() {
    System.out.println("before decorator");
    source.method();
    System.out.println("after decorator");
  }
}
