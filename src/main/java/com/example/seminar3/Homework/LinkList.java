package com.example.seminar3.Homework;

public class LinkList {
    Node head;
    Node tail;

    // Метод для очереди
    public void push(int value) {
        Node node = new Node();
        // Если "очередь" пустая, то добавляем через add
        if (head == null) {
            add(value);
        } else {
            node.value = value;
            node.next = head;
            head.previous = node;
            head = node;
        }

    }

    //Взять значение из очереди
    public Integer peek() {
        Integer result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    // Добавить узел и значение
    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    // Добавление узла в связанный список после указанного узла
    public void addInFind(int value, Node prevNode) {
        Node node = new Node();
        node.value = value;
        Node nextNode = prevNode.next;
        prevNode.next = node;
        node.previous = prevNode;
        node.next = nextNode;
        nextNode.previous = node;

    }

    // Удаление узла. Node может передаваться методом find
    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            head = next;
        } else {
            if (next == null) {
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    //Вывод связанного списка
    public void print(Node head) {
        System.out.print("[ ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println("]");
    }

    // Поиск узла по значению
    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    // разворот двусвязного списка
    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    private class Node {
        int value;
        Node next;

        Node previous;
    }
}
