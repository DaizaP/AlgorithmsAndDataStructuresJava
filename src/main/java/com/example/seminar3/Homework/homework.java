package com.example.seminar3.Homework;

//Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
public class homework {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int key : list) {
            // Добавляем значение с двусвязный список
            linkList.add(key);
        }
        linkList.print(linkList.head);
        linkList.revert();
        linkList.print(linkList.head);
    }
}
