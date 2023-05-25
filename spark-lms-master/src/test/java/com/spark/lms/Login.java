package com.spark.lms;

import com.spark.lms.common.Constants;
import com.spark.lms.model.User;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class Login {

    public boolean login_fnValidate_Valid() {
        /* if(userName=admin && pasword=admin)
        {
            return true;
        }
        else
        {
            return false;
        }*/
        return  true;
    }

    public boolean login_fnValidate_InValid() {
          /* if(userName!=admin && pasword!=admin)
        {
            return true;
        }
        else
        {
            return false;
        }*/
        return true;
    }
}
