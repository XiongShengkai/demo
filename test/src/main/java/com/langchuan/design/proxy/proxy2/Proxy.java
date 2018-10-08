package com.langchuan.design.proxy.proxy2;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 10:28
 */
public class Proxy implements Sourceable {

  private Source source;

  public Proxy() {
    super();
    this.source = new Source();
  }

  @Override
  public void method() {
    before();
    source.method();
    after();
  }

  private void after() {
    System.out.println("after proxy!");
  }

  private void before() {
    System.out.println("before proxy!");
  }
}
