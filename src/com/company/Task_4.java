package com.company;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userNumber;
        System.out.print("Введите число от 1 до 100: ");
        userNumber = in.nextInt();
        if (userNumber > 100 || userNumber < 1) {
            System.out.println("Число не принадлежит данному диапазону!");
            return;
        }
        int count = 1;
        int computerNumber = 50;
        int min = 0;
        int max = 0;
        int i = 0;
        while (computerNumber != userNumber) {

            if (computerNumber > userNumber) {
                max = computerNumber;
                computerNumber -= (max - min) / 2;
                i++;
            } else if (computerNumber < userNumber && i > 0) {
                min = computerNumber;
                computerNumber += (max - min) / 2;
            } else {
                min = computerNumber;
                computerNumber += min / 2;
            }
            count++;
        }
        System.out.println("Потрачено попыток: " + count + " Число: " + computerNumber);
    }
}
