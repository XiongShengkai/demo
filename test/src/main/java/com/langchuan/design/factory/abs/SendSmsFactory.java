package com.langchuan.design.factory.abs;

import com.langchuan.design.factory.Sender;
import com.langchuan.design.factory.SmsSender;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/29 11:00
 */
public class SendSmsFactory implements Provider {

  @Override
  public Sender produce() {
    return new SmsSender();
  }
}
