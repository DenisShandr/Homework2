package com.company;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        int i = 0;
        System.out.print("У вас 3 попытки дать ответ, не знаете ответ, введите \"сдаюсь\". ");
        while (i < 3){
            System.out.println("Сколько месяцев в году?");
            System.out.print("Ваш ответ: ");
            answer = in.nextLine();
            switch (answer.trim()){
                case "12":
                    System.out.println("Верно!");
                    return;
                case "двенадцать":
                    System.out.println("Верно!");
                    return;
                case "Двенадцать":
                    System.out.println("Верно!");
                    return;
                case "сдаюсь":
                    System.out.println("Ответа нет!");
                    return;
                default:
                    System.out.print("Неверно! ");
                    if (i == 2){
                        System.out.println("Исчерпан лимит ответов!");
                    }
            }
            i++;
        }
    }
}
