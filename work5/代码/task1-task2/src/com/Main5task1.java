package com;

import java.io.*;

public class Main5task1 {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("doro.jpg");
            FileOutputStream out = new FileOutputStream("doro_copy.jpg")) {
            byte[] bytes = new byte[1024];
            int tmp;
            while((tmp = in.read(bytes)) != -1) {
                out.write(bytes,0,tmp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } //自动关,先关输出，再关输入
    }
}
