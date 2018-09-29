package com.langchuan.algorithm;

/**
 * @author: kevin.xiong
 * @description:直接选择排序
 * @date:2018/9/28 16:58
 */
public class StraightSelectionSorter extends Sorter {

  @Override
  public void sort(int[] array) {
    int temp; //用于交换数据的暂存单元
    //这里只要0--array.length - 2即可
    for (int i = 0; i < array.length - 1; i++) {
      int k = i;
      //该循环可以找到右侧无序区最小的元素
      for (int j = i + 1; j < array.length; j++) {
        if (array[k] > array[j]) {
          k = j;
        }
      }
      //如果array[i]不是无序区最小的，需要与无序区最小的进行交换
      if (k != i) {
        temp = array[i];
        array[i] = array[k];
        array[k] = temp;
      }
      //如果array[i]是无序区最小的元素，不需要执行交换
    }
  }
}
