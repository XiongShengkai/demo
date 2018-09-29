package com.langchuan.algorithm;

/**
 * @author: kevin.xiong
 * @description:冒泡排序
 * @date:2018/9/28 16:32
 */
public class BubbleSorter extends Sorter {

  @Override
  public void sort(int[] array) {
    //用于交换数据的暂存单元
    int tmp;
    for (int i = array.length - 1; i >= 0; i--) {
      for (int j = 1; j <= i; j++) {
        if (array[j - 1] < array[j]) {
          tmp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = tmp;
        }
      }
    }
  }
}
