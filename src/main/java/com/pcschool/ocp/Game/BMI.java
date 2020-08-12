
package com.pcschool.ocp.Game;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Hello BMI");
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入身高");
        double h = sc.nextDouble();
        System.out.print("請輸入體重");
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100,2);
        PrintStream printf = System.out.printf("身高", Arrays.toString(args));
    }
    
}
