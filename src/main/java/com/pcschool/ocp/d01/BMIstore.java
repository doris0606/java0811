
package com.pcschool.ocp.d01;

import java.awt.PageAttributes;
import java.io.PrintStream;


public class BMIstore {
    public static void main(String[] args) {
        BMI bl = new BMI();
        bl.name="John";bl.h=170;bl.w=60;
        bl.setBMI();
        
        BMI b2 = new BMI();
        b2.name="Mary";b2.h=165;b2.w=45;
        b2.setBMI();
               
    
       System.out.printf
        ("%s (%.1f, %.1f)bmi =%.2f\n", b1.name, b1.h, b1.w, b1.bmi);
       System.out.printf
        ("%s (%.1f, %.1f)bmi =%.2f\n", b2.name, b2.h, b2.w, b2.bmi);

       
    
    }
    
}
