package com.example.seminar4.Homework;

public class Task1 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.add(7);
        bt.add(8);
        bt.add(9);
        bt.remove(8);
        bt.print();
    }
}
