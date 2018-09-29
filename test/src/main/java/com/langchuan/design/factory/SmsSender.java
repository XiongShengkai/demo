package com.langchuan.design.factory;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/29 10:18
 */
public class SmsSender implements Sender {

  @Override
  public void send() {
    System.out.println("this is smsSender!");
  }
}
