package com.pcschool.ocp.d01;

import java.io.PrintStream;

public class Petstore2 {
    public static void main(String[] args) {
        Cat d1 = new Cat();
        Cat d2 = new Cat();
        Cat d3 = new Cat();
        //d1, d2, d3 資料設定
        Cat.type = "短毛貓";
        d1.age = 3;d1.price = 26000;d1.amount = 10;
        d1.age = 2;d1.price = 28000;d1.amount = 15;
        d1.age = 4;d1.price = 30000;d1.amount = 20;
        //d1, d2, d3 資料輸出
        System.out.printf("品種: %s 年齡: %d 價格: %,d 數量: %d 小計:d\n",
                         Cat.type, d1.age, d1.price, d1.amount,(d1.price*d1.amount));
        System.out.printf("品種: %s 年齡: %d 價格: %,d 數量: %d 小計:d\n",
                         Cat.type, d2.age, d2.price, d2.amount,(d2.price*d2.amount));
        System.out.printf("品種: %s 年齡: %d 價格: %,d 數量: %d 小計:d\n",
                         Cat.type, d3.age, d3.price, d3.amount,(d3.price*d3.amount));
        //d1, d2, d3 的小計總和
        int sum = (d1.price*d1.amount) + (d2.price*d2.amount) +(d3.price*d3.amount);
        PrintStream printf = System.out.printf("Dog 總資產: %,d\n", sum);
        
        
        
    }
    
}
