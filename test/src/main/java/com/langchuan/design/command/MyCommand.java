package com.langchuan.design.command;

/**
 * @author: kevin.xiong
 * @description: 命令类
 * @date:2018/9/30 15:30
 */
public class MyCommand implements Command {

  private Receiver receiver;

  public MyCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void exe() {
    receiver.action();
  }
}
