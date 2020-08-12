
package com.pcschool.ocp.Game;

import java.util.Scanner;


public class GameService {
    public static void start() {
        while (true) {
            System.out.println("Java Game");
            System.out.println("-------------");
            System.out.println("1. 猜數字");
            System.out.println("2. 猜字母");
            System.out.println("9. Exit");
            System.out.println("--------------");
            System.out.print("請選擇 ==> ");
            int choice =new Scanner(System.in).nextInt();
            switch(choice) {
                case 1:
                    numberGameLoop();
                    break;
                case 2:
                    englishGameLoop();
                    break;
                case 9:
                    return;
            }
            System.out.println("請按下 Enter 鍵繼續 ...");
            new Scanner(System.in).nextLine();
            
            
        }
    }

    static void Start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
