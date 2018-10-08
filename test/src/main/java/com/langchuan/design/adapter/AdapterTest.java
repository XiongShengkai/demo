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

  /** 测试接口的适配器模式*/
  @Test
  public void test3(){
    SourceSub1 sub1 = new SourceSub1();
    SourceSub2 sub2 = new SourceSub2();

    System.out.println("1");
    sub1.method1();
    System.out.println("2");
    sub1.method2();
    System.out.println("3");
    sub2.method1();
    System.out.println("4");
    sub2.method2();
  }
}
