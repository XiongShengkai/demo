package com.langchuan.design.factory;

/**
 * @author: kevin.xiong
 * @description: 工厂类  多个工厂方法模式
 * @date:2018/9/29 10:19
 */
public class SendFactory2 {

  /**
   * 是对普通工厂模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象。
   * 而多个工厂方法模式是提供多个方法，分别创建对象。
   */

  public Sender produceMail(){
    return new MailSender();
  }

  public Sender produceSms(){
    return new SmsSender();
  }
}
