package com.langchuan.design.bridging;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 11:35
 */
public class MyBridge extends Bridge {

  @Override
  public void method() {
    getSource().method();
  }
}
