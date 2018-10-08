package com.langchuan.design.strategy;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 14:51
 */
public class Plus extends AbstractCalculator implements ICalculator {

  @Override
  public int calculate(String exp) {
    int[] arrayInt = split(exp, "\\+");

    return 0;
  }
}
