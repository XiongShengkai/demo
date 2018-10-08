package com.langchuan.design.command;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 15:38
 */
public class Test {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    MyCommand myCommand = new MyCommand(receiver);
    Invoker invoker = new Invoker(myCommand);
    invoker.action();
  }
}
