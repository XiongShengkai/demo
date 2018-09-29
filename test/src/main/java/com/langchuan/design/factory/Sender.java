package com.langchuan.design.factory;

/**
 * @author: kevin.xiong
 * @description: 工厂模式接口类   https://blog.csdn.net/doymm2008/article/details/13288067
 * @date:2018/9/29 10:15
 */
public interface Sender {

  /**
   * 工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建
   * 大多数情况下，我们选择不需要创建实例的静态工厂方法模式。
   *
   * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要扩展程序，必须对工厂类进行修改，
   * 这违背了闭包原则，所以，就用到抽象工厂模式，创建多个工厂类，这样需要增加新功能，
   * 直接增加新的工厂类。
   */
  public void send();
}
