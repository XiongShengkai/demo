package com.langchuan.design.memorandum;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 16:32
 */
public class Storage {

  private Memento memento;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }

  public Storage(Memento memento) {
    this.memento = memento;
  }
}
