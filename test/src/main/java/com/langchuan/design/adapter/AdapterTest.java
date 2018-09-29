package com.langchuan.design.adapter;

import org.junit.Test;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/29 19:21
 */
public class AdapterTest {

  public static void main(String[] args) {
    Targetable target = new Adapter();
    target.method1();
    target.method2();
  }

  /** 测试对象的适配器模式*/
  @Test
  public void test2(){
    Source source = new Source();
    Targetable target = new Wrapper(source);
    target.method1();
    target.method2();
  }
}
