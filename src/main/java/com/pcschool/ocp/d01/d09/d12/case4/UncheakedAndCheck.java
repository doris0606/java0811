package com.pcschool.ocp.d01.d09.d12.case4;

public class UncheakedAndCheck {
    public static void main(String[] args) {
        
    }
    public static void a() {
        int x = 10;
        int d = 0;
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
}
