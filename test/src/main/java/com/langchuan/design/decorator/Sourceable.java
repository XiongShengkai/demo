package com.langchuan.design.decorator;

/**
 * @author: kevin.xiong
 * @description: 装饰者模式
 * @date:2018/9/30 10:01
 */
public interface Sourceable {

  /**
   * 顾名思义，装饰者模式就是给一个对象增加一个新的功能，而且是动态的。要求装饰对象和 被装饰对象实现
   * 同一个接口，装饰对象持有被装饰对象的实例
   *
   * 装饰者模式的应用场景：
   *    1、需要扩展一个类的功能
   *    2、动态的为一个对象增加功能，而且还能动态撤销。(继承不能做到这一点，继承的功能时静态的，不能动态增删)
   *
   * 缺点：产生过多相似的对象，不易排错！
   */

  public void method();
}
