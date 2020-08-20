package com.pcschool.ocp.d01.d09.case1;

public class Employee {
    String name = "月例會";
    class Job{
    String name  = "Java";
    public void program() {
        String name  = "寫程式";
        System.out.println(name + ":" + this.name);
    }
    public void meeting() {
        String name  = "開會";
        System.out.println(name + ":" + Employee.this.name);
    }
    }
    
    class Study{
       public void read() {
           String appName = "美食 App";
           int hours = 60;
           System.out.println("進修時間:" + hours + " H");
           
           class App {
               public void printname() {
                   System.out.println(appName);
               }  
           }
           App app = new App();
           app.printname();
       }
    }
    
}
