package com.pcschool.ocp.d01.d09.d12.case4;

import static com.pcschool.ocp.d01.d09.d12.case4.UncheakedAndCheck.d;
import java.io.EOFException;

public class UncheakedAndCheck {
    public static void main(String[] args) {
        a(0);
        b(0);
        try {
            c(0);
        }catch (ArithmeticException e) {
            System.out.printf("main 自行處理數學錯誤: %s\n", e);
        }
     
       
    }
    public static void a(int d) {
        int x = 10;
        try {
            int result = x / d;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("分母不可為 0");
        }
    }
    public static void b(int d) {
        int x = 10;
        if(d == 0) {
            System.out.println("分母不可為 0");
            return;
        }
        int result = x / d;
        System.out.println(result);
    }
    public static void c(int d) {
        int x = 10;
        int result = x / d;
        System.out.println(result);
    }
     public static void d(int d) {
        int x = 10;
        if(d == 0) {
            Exception e = new EOFException("d 說: 分母不可為 0");
        }
    

    
    }
    }
