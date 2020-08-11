
package com.pcschool.ocp.d01;


public class BMIstore {
    public static void main(String[] args) {
        BMI bl = new BMI();
        bl.name="John";bl.h=170;bl.w=60;
        bl.bmi = bl.calcBMI();
        
        BMI b2 = new BMI();
        b2.name="Mary";b2.h=165;b2.w=45;
        b2.bmi = b2.calcBMI();
               
        
        System.out.printf("%s bmi =%");

       
    
    }
    
}
