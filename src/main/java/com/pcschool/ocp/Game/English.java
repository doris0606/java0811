package com.pcschool.ocp.Game;

import java.util.Scanner;

public class JavaGame {
    public static void main(String[] args) {
        englishGameLoop();
    }
    
    
    public static void englishGameLoop() {
        English english = new English();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入字母: ");
            int userAns = sc.next().toUpperCase().charAt(0);
            int reselt = english.check(userAns);
            if (reselt == 0) {
                System.out.println("恭喜答對了");
                break;
            } else {
                System.out.printf("猜第 %d 次, 結果: 猜 %s 了\n",
                        english.getCount(), result > 0 ? "大" : "小");
                                  
            }
            
        }
    }
    
}

