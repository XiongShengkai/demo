package com.langchuan.design.command;

/**
 * @author: kevin.xiong
 * @description: 调用者
 * @date:2018/9/30 15:35
 */
public class Invoker {

  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void action(){
    command.exe();
  }
}
