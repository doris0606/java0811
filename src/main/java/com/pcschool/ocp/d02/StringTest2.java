package com.pcschool.ocp.d02;

public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        s3 = s3.intern();
        System.out.println(s1 == s3);
    }
    
}
