package com.langchuan.design.adapter;

/**
 * @author: kevin.xiong
 * @description: 对象的适配器模式
 * @date:2018/9/29 19:25
 */
public class Wrapper implements Targetable {

  private Source source;

  public Wrapper(Source source) {
    this.source = source;
  }

  @Override
  public void method1() {
    source.method1();
  }

  @Override
  public void method2() {
    System.out.println("this is the targetable method!");
  }
}
