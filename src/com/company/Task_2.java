package com.company;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte monthNumber;
        byte dayNumber;
        System.out.print("Введите номер месяца: ");
        monthNumber = in.nextByte();
        if (monthNumber > 12 || monthNumber < 1){
            System.out.println("Нет такого месяца!");
            return;
        }
        System.out.print("Введите число проверяемого дня: ");
        dayNumber = in.nextByte();
        switch (monthNumber){
            case 1:
                dayVerification(dayNumber, (byte) 31);
                break;
            case 2:
                dayVerification(dayNumber, (byte) 29);
                break;
            case 3:
                dayVerification(dayNumber, (byte) 31);
                break;
            case 4:
                dayVerification(dayNumber, (byte) 30);
                break;
            case 5:
                dayVerification(dayNumber, (byte) 31);
                break;
            case 6:
                dayVerification(dayNumber, (byte) 30);
                break;
            case 7:
                dayVerification(dayNumber, (byte) 31);
                break;
            case 8:
                dayVerification(dayNumber, (byte) 31);
                break;
            case 9:
                dayVerification(dayNumber, (byte) 30);
                break;
            case 10:
                dayVerification(dayNumber, (byte) 31);
                break;
            case 11:
                dayVerification(dayNumber, (byte) 30);
                break;
            case 12:
                dayVerification(dayNumber, (byte) 31);
                break;
            }
    }

    private static void dayVerification(byte dayNumber, byte daysInMonth) {
        if (dayNumber <= daysInMonth && dayNumber >= 1) {
            System.out.println("Такой день есть в данном месяце.");
        } else {
            System.out.println("Такого дня нету в этом месяце");
        }
    }
}
