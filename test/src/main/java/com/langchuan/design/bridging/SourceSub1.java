package com.langchuan.design.bridging;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 11:32
 */
public class SourceSub1 implements Sourceable {

  @Override
  public void method() {
    System.out.println("this is the first sub!");
  }
}
