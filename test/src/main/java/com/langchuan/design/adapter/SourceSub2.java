package com.langchuan.design.adapter;

/**
 * @author: kevin.xiong
 * @description:接口的适配器模式
 * @date:2018/9/29 20:15
 */
public class SourceSub2 extends Wrapper2 {

  @Override
  public void method2() {
    System.out.println("the sourceable interface's second sub2!");
  }
}
