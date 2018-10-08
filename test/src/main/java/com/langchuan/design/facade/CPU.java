package com.langchuan.design.facade;

/**
 * @author: kevin.xiong
 * @description: 外观模式
 * @date:2018/9/30 10:37
 */
public class CPU {

  /**
   * 外观模式是为了解决类与类之间的依赖关系的，像Spring一样，可以将类与类之间的关系配置到配置文件中，
   * 而外观模式就是将它们的关系放在一个Facade类中，降低类类之间的耦合
   */

  public void startup(){
    System.out.println("cpu startup!");
  }

  public void shutdown(){
    System.out.println("cpu shutdown!");
  }
}
