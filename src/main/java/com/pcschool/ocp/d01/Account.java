package com.pcschool.ocp.d01;

public class Account {
    
   private int balance;
    int getMoney;  
   //存款
   public void save(int money) {
       if(money > 0) {
       balance += money;
   }  
}
//提款
   public void withdraw(int money) {
   if(money > 0 && balance >= money) {
        balance -= money;
       }
   }
   
//
   public int getBalance() {
    return balance;
   }