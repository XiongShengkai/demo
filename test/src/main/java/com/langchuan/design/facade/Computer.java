package com.langchuan.design.facade;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 10:42
 */
public class Computer {

  private CPU cpu;
  private Memory memory;
  private Disk disk;

  public Computer() {
    cpu = new CPU();
    memory = new Memory();
    disk = new Disk();
  }

  public void startup(){
    System.out.println("start the computer!");
    cpu.startup();
    memory.startup();
    disk.startup();
    System.out.println("start computer finished!");
  }

  public void shutdowm(){
    System.out.println("begin to close the computer!");
    cpu.shutdown();
    memory.shutdown();
    disk.shutdown();
    System.out.println("computer closed!");
  }
}
