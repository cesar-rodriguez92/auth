package com.crodriguezt.dev.auth.auth.service.impl;

import com.crodriguezt.dev.auth.auth.common.Constants;
import com.crodriguezt.dev.auth.auth.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by tempo on 18/09/18.
 */
@Service("authService")
public class AuthServiceImpl implements AuthService{

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public Map<String, Object> validateToken(String apiKey){

        boolean valid;
        Map<String, Object> validate = new HashMap<>();

        Random random = new Random();
        double r = random.nextDouble();

        if (r < 0.5){
            valid = true;
        }else{
            valid = false;
        }
        validate.put(Constants.VALID, valid);
        return validate;
    }
}
