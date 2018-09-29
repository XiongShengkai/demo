package com.langchuan.algorithm;

import org.junit.Test;

/**
 * @author: kevin.xiong
 * @description: 测试类
 * @date:2018/9/28 16:51
 */
public class TestSorter {

  public static int[] array = {5,8,3,41,21,14,17};

  /**
   * 测试冒泡排序
   */
  @Test
  public void testBubbleSorter(){
    BubbleSorter bubbleSorter = new BubbleSorter();
    bubbleSorter.sort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  /**
   * 测试直接选择排序
   */
  @Test
  public void testStraightSelectionSorter(){
    StraightSelectionSorter straightSelectionSorter = new StraightSelectionSorter();
    straightSelectionSorter.sort(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}
