package com.Example;

import java.util.Scanner;
public class Main2task2t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
        scanner.close();
    }

    public static void print(int n) {
        int h = (n + 1) / 2;
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int a = 1; a <= 2 * i - 3; a++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int b = 1; b < h; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (b < h - 1) {
                for (int c = 1; c <= 2 * (h - b) - 3; c++) {
                    System.out.print(" ");

                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}