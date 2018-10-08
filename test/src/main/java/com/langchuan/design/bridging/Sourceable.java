package com.langchuan.design.bridging;

/**
 * @author: kevin.xiong
 * @description: 桥接模式
 * @date:2018/9/30 11:31
 */
public interface Sourceable {

  /**
   * 把事务和其具体实现分开
   */
  public void method();
}
