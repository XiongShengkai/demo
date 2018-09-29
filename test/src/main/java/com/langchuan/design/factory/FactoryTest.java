package com.langchuan.design.factory;

import com.langchuan.design.factory.abs.SendSmsFactory;
import org.junit.Test;

/**
 * @author: kevin.xiong
 * @description:测试类
 * @date:2018/9/29 10:24
 */
public class FactoryTest {

  /** 测试普通工厂模式*/
  @Test
  public void test1(){
    SendFactory factory = new SendFactory();
    Sender sender = factory.produce("sms");
    sender.send();
  }

  /** 测试多个工厂方法模式*/
  @Test
  public void test2(){
    SendFactory2 factory2 = new SendFactory2();
    Sender sender = factory2.produceMail();
    sender.send();
  }

  /** 测试静态工厂方法模式*/
  @Test
  public void test3(){
    Sender sender = SendFactory3.produceMail();
    sender.send();
  }

  /** 测试抽象工厂方法模式*/
  @Test
  public void test4(){
    SendSmsFactory factory = new SendSmsFactory();
    Sender sender = factory.produce();
    sender.send();

  }
}
