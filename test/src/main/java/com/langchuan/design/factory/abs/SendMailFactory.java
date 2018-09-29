package com.langchuan.design.factory.abs;

import com.langchuan.design.factory.MailSender;
import com.langchuan.design.factory.Sender;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/29 10:59
 */
public class SendMailFactory implements Provider {

  @Override
  public Sender produce() {
    return new MailSender();
  }
}
