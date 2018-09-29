package com.langchuan.design.factory;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/29 10:17
 */
public class MailSender implements Sender {

  @Override
  public void send() {
    System.out.println("this is mailSender!");
  }
}
