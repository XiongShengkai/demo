package com.langchuan.design.proxy.proxy2;

/**
 * @author: kevin.xiong
 * @description:代理模式
 * @date:2018/9/30 10:26
 */
public interface Sourceable {

  /**
   * 代理模式的使用场景
   *    如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种方法
   *    1、修改原有的方法来适应，这样违反了开闭原则
   *    2、就是采用一个代理类调用原来的方法，且对产生的结果进行控制。这种方法就是代理模式。
   *    使用代理模式，可以将功能划分的更加清晰，有助于后期维护。
   */

  public void method();
}
