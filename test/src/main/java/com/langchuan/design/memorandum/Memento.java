package com.langchuan.design.memorandum;

/**
 * @author: kevin.xiong
 * @description: 备忘录模式
 * @date:2018/9/30 16:29
 */
public class Memento {

  private String value;

  public Memento(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
