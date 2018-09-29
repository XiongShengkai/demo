package com.langchuan.design.factory;

/**
 * @author: kevin.xiong
 * @description: 工厂类  静态工厂方法模式
 * @date:2018/9/29 10:19
 */
public class SendFactory3 {

  /**
   * 将上面的多个工厂方法模式里的方法设置为静态的，不需要创建实例，直接调用即可。
   */

  public static Sender produceMail(){
    return new MailSender();
  }

  public static Sender produceSms(){
    return new SmsSender();
  }
}
