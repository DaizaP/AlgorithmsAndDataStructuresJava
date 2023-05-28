package com.example.seminar1;

//Задание 1 (тайминг 5 минут)
//Необходимо написать алгоритм, считающий сумму всех чисел
//от 1 до N. Согласно свойствам линейной сложности,
//количество итераций цикла будет линейно изменяться
//относительно изменения размера N.
public class example1 {
    public static void main(String[] args) {
        System.out.println(TotalAmount(15));
    }

    public static String TotalAmount(int value) {
        return (value * (value + 1) / 2) + "";
    }
}