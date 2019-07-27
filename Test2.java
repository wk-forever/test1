package com.itheima.test;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("。。。。");
        String str = sc.nextLine();
        File file = new File("D:\\aaa.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        if("HelloWorld".equals(str)){
            bw.write(str);
        }
        bw.flush();
        bw.close();
    }
    @Test
    public void test1() throws IOException {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test2(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
# test1
