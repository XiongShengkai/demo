package com.langchuan.design.group;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author: kevin.xiong
 * @description: 组合模式
 * @date:2018/9/30 11:43
 */
public class TreeNode {

  /**
   * 组合模式有时又叫部分-整体模式，在处理类似树形结构的问题时比较方便
   */

  private String name;
  private TreeNode parent;
  private Vector<TreeNode> children = new Vector<TreeNode>();

  public TreeNode(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TreeNode getParent() {
    return parent;
  }

  public void setParent(TreeNode parent) {
    this.parent = parent;
  }

  public void add(TreeNode node){
    children.add(node);
  }

  public void remote(TreeNode node){
    children.remove(node);
  }

  public Enumeration<TreeNode> getChildren(){
    return children.elements();
  }
}
