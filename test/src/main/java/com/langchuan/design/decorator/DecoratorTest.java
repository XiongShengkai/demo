package com.langchuan.design.decorator;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 10:09
 */
public class DecoratorTest {

  public static void main(String[] args) {
    Sourceable source = new Source();
    Sourceable decorator = new Decorator(source);
    decorator.method();
  }
}
