package com.pcschool.ocp.d01.d09.d12.case2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileDemo {
    public static void main(String[] args) {
        
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d01\\d09\\d12\\case2\\news.txt";
        
        File file = new File(path);
        
        try {
            String date = new Scanner(file).useDelimiter("\\A").next();
            System.out.println(date);
        } catch (FileNotFoundException ex) {
            System.out.printf("檔案路徑錯誤: %s\n", ex);
        }
    }
    
}
