package com.example.seminar1;

import java.util.ArrayList;
import java.util.List;

//Задание 2 (тайминг 10 минут)
//Написать алгоритм поиска простых чисел (делятся только на себя и
//на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
//вложенный for, что явно говорит о квадратичной сложности, на этом
//стоит акцентировать внимание
public class example2 {
    public static void main(String[] args) {
        System.out.println(SimpleNumbers(100));
    }

    public static List<Integer> SimpleNumbers(int value) {
        List<Integer> num = new ArrayList<>();
        boolean check = true;
        for (int i = 1; i <= value; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                num.add(i);
            }
            check = true;
        }
        return num;
    }
}
