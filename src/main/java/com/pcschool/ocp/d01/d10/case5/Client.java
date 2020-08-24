package com.pcschool.ocp.d01.d10.case5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    public static void main(String[] args) throws LoginException {
        accessLogin();
    }
    public static void accessLogin() {
        LoginService service = new LoginService();
        String username = "john";
        String password = "1234";
        boolean check;
        try {
            check = service.login(username, password);
            System.out.println(check);
        } catch (LoginException ex) {
            System.out.println(ex.getMessage());
            ex.how2do();
        }
        
        
    }
}
