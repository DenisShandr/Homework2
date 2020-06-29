package com.company;


import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность: ");
        int size;
        size = in.nextInt();
        int layer = 1;
        if (size % 2 != 1) {
            size++;
        }
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int k = i; k < array.length; k++) {
                for (int l = i; l < array.length - k; l++) {
                    array[k][l] = layer;
                    if (l == array.length - k - 1) {
                        array[k][array.length - layer] = layer;
                        array[array.length - layer][k] = layer;
                    }
                }
            }
            layer++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}