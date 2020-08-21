package com.pcschool.ocp.d01.d10.case3;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        
        Set s1 = new HashSet();
        s1.add(100);
        s1.add(90);
        s1.add(80);
        System.out.println(s1);
        Set s2 = new LinkedHashSet();
        s2.add(100);
        s2.add(90);
        s2.add(80);
        System.out.println(s2);
        Set s3 = new TreeSet();
        s1.add(100);
        s1.add(90);
        s1.add(80);
        System.out.println(s3);
    }
    
}
