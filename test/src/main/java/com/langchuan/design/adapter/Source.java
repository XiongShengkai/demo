package com.langchuan.design.adapter;

/**
 * @author: kevin.xiong
 * @description: 适配器模式
 * @date:2018/9/29 17:27
 */
public class Source {

  /**
   * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
   * 主要分为三类：类的适配器模式，对象的适配器模式，接口的适配器模式。
   */

  /**
   * 类的适配器模式
   * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将
   * Source的功能扩展到Targetable里
   */

  public void method1(){
    System.out.println("this is original method!");
  }
}
