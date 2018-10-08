package com.langchuan.design.bridging;

/**
 * @author: kevin.xiong
 * @description: 定义一个桥
 * @date:2018/9/30 11:34
 */
public abstract class Bridge {

  private Sourceable source;

  public void method(){
    source.method();
  }

  public Sourceable getSource() {
    return source;
  }

  public void setSource(Sourceable source) {
    this.source = source;
  }
}
