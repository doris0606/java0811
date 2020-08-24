package com.pcschool.ocp.d01.d10.case5;

import java.util.Optional;

public class LoginService {
    public boolean login(String username, String password) {
        
        User optUser = UserDB.getINstance().getUser(username);
        if(optUser.isPresent()) {
            User user = optUser.get();
            if(user.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            } 
        } else {
            return false;
        }
    }
}
