package com.langchuan.design.adapter;

/**
 * @author: kevin.xiong
 * @description: 类的适配器模式
 * @date:2018/9/29 19:15
 */
public class Adapter extends Source implements Targetable {

  @Override
  public void method2() {
    System.out.println("this is the targetable method!");
  }
}
