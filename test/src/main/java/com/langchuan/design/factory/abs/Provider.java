package com.langchuan.design.factory.abs;

import com.langchuan.design.factory.Sender;

/**
 * @author: kevin.xiong
 * @description:抽象工厂方法模式
 * @date:2018/9/29 10:58
 */
public interface Provider {

  /**
   * 如果想增加一个功能，则只需要做一个实现类，实现Sender接口，
   * 同时做一个工厂类，实现Provider接口
   */
  public Sender produce();
}
