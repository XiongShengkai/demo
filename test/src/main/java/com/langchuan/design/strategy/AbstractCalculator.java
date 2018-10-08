package com.langchuan.design.strategy;

/**
 * @author: kevin.xiong
 * @description: 辅助类
 * @date:2018/9/30 14:16
 */
public abstract class AbstractCalculator {

  public int[] split(String exp, String opt) {
    String[] array = exp.split(opt);
    int[] arrayInt = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      arrayInt[i] = Integer.parseInt(array[i]);
    }
    return arrayInt;
  }
}
