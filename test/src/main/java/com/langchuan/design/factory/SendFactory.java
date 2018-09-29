package com.langchuan.design.factory;

/**
 * @author: kevin.xiong
 * @description: 工厂类  普通工厂模式
 * @date:2018/9/29 10:19
 */
public class SendFactory {

  public Sender produce(String type) {
    if ("mail".equals(type)) {
      return new MailSender();
    } else if ("sms".equals(type)) {
      return new SmsSender();
    } else {
      System.out.println("请输入正确的类型！");
      return null;
    }
  }
}
