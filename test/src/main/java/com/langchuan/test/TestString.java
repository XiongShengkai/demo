package com.langchuan.test;

import org.junit.Test;

/**
 * @author: kevin.xiong
 * @description: java中==和equals的区别  http://www.cnblogs.com/chenyu123/p/4303634.html
 * @date:2018/9/28 15:04
 */
public class TestString {

  /**
   * 基本数据类型的比较，应用双等号(==),比较的是他们的值。
   * 引用数据类型
   *    当它们用==进行比较的时候，比较的是他们在内存中的存放地址。
   *    但一些类库覆盖了Object基类中的equals方法，其比较的就是对象的值，否则比较的仍是地址。
   */

  @Test
  public void test1() {
    String s1 = "Monday";
    String s2 = "Monday";
    if (s1 == s2) {
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }
    if (s1.equals(s2)) {
      System.out.println("s1 equals s2");
    } else {
      System.out.println("s1 not equals s2");
    }
  }

  @Test
  public void test2() {
    String s1 = "Monday";
    String s2 = new String("Monday");

    if (s1 == s2) {
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }

    if (s1.equals(s2)) {
      System.out.println("s1 equals s2");
    } else {
      System.out.println("s1 not equals s2");
    }
  }

  @Test
  public void test3(){
    String s1 = "Monday";
    String s2 = new String("Monday");
    /** intern 返回的仍是当前字符串，
     * 实际操作中，它检查字符串池里是否存在当前字符串，
     * 如果存在，就返回池里的字符串
     * 如果不存在，就把该字符串加入到字符串池中，然后再返回它的引用。
     */
    s2 = s2.intern();

    if (s1 == s2) {
      System.out.println("s1 == s2");
    } else {
      System.out.println("s1 != s2");
    }

    if (s1.equals(s2)) {
      System.out.println("s1 equals s2");
    } else {
      System.out.println("s1 not equals s2");
    }
  }
}
