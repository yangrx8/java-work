package com.Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.Example.tool.Print;
import java.util.InputMismatchException;


public class Main1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        try(Scanner sc = new Scanner( new File("data.txt"))) {
            while(sc.hasNext()) {
                try {
                    int a = sc.nextInt();
                    sum = sum + a;
                    count++;
                } catch (InputMismatchException e) {
                    Print.print("存在非整数" + sc.next());
                }
            }
            if(count > 0) {
                double average = (double)sum / count;
                Print.print("平均数是" + average);
            } else {
                throw new EmptyFileException();
            }

        } catch (FileNotFoundException e) {
            Print.print("文件不存在");
        } catch (InputMismatchException e) {
            Print.print("存在非整数");
        } catch (EmptyFileException e) {
            Print.print("文件为空");
        }
    }
}
