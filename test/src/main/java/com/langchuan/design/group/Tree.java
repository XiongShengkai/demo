package com.langchuan.design.group;

/**
 * @author: kevin.xiong
 * @description:
 * @date:2018/9/30 11:49
 */
public class Tree {

  TreeNode root = null;

  public Tree(String name) {
    root = new TreeNode(name);
  }

  public static void main(String[] args) {
    Tree tree = new Tree("A");
    TreeNode noteB = new TreeNode("B");
    TreeNode noteC = new TreeNode("C");

    noteB.add(noteC);
    tree.root.add(noteB);
    System.out.println("build the tree finished!");
  }
}
