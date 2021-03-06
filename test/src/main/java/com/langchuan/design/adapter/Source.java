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
   * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
   *    创建一个新类，继承原有的类，实现新的接口即可。
   * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，
   *    持有原类的一个实例，在Wrapper类的方法中，调用实例的方法即可。
   * 接口的适配器模式：当不希望实现一个接口中的所有方法时，可以创建一个抽象类Wrapper，实现所有方法，
   *    我们写别的类的时候，继承抽象类即可。
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
