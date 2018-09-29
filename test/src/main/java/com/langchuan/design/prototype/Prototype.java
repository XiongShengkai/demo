package com.langchuan.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author: kevin.xiong
 * @description: 原型模式
 * @date:2018/9/29 16:26
 */
public class Prototype implements Cloneable,Serializable{
  /**
   * 该模式的思想就是将一个对象作为原型，对其进行复制，克隆，产生一个和原对象类似的新对象
   */
  private static final long serialVersionUID = 1L;
  private String string;

  private SerializableObject obj;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Prototype proto = (Prototype) super.clone();
    return proto;
  }

  public Object deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(this);

    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    return ois.readObject();
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public SerializableObject getObj() {
    return obj;
  }

  public void setObj(SerializableObject obj) {
    this.obj = obj;
  }

  class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
  }
}