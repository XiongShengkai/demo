package com.langchuan.design.bridging;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 11:35
 */
public class BridgeTest {

  /**
   * 这样，通过对Bridge类的调用，实现了对接口Sourceable的实现类Sourceable1和Sourceable2的调用
   * @param args
   */
  public static void main(String[] args) {
    Bridge bridge = new MyBridge();

    SourceSub1 sourceSub1 = new SourceSub1();
    bridge.setSource(sourceSub1);
    bridge.method();

    SourceSub2 sourceSub2 = new SourceSub2();
    bridge.setSource(sourceSub2);
    bridge.method();
  }
}
