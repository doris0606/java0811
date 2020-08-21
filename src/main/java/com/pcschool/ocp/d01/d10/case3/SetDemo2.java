
package com.pcschool.ocp.d01.d10.case3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("國文");
        set.add(new Integer(100));
        set.add("英文");
        set.add(80);
        set.add("數學");
        set.add(90);
        System.out.println(set);
        
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            System.out.println(next);
        }
        iter = set.iterator();
    }
    
    
}
