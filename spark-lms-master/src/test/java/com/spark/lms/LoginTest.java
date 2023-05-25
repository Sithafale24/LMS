package com.spark.lms;

import com.spark.lms.controller.LoginController;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void login_fnValidate_Valid() {
        // Test logic goes here
        Login login = new Login();

        // Set up any required test data or dependencies

        // Call the method under test
        boolean result = login.login_fnValidate_Valid();

        // Assert the expected result
        assertTrue(result);
    }
    @Test
   public void Login_fnValidate_Invalid(){
        Login login=new Login();
        boolean result=login.login_fnValidate_InValid();
   }


    // Other test methods can be added here if needed
}

