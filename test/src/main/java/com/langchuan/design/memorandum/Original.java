package com.langchuan.design.memorandum;

/**
 * @author: kevin.xiong
 * @description: 备忘录模式
 * @date:2018/9/30 16:28
 */
public class Original {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Original(String value) {
    this.value = value;
  }

  public Memento createMemento() {
    return new Memento(value);
  }

  public void restoreMemento(Memento memento) {
    this.value = memento.getValue();
  }
}
