package com.crodriguezt.dev.auth.auth.tokenAuth;

import com.crodriguezt.dev.auth.auth.common.Constants;
import com.crodriguezt.dev.auth.auth.common.RestPaths;
import com.crodriguezt.dev.auth.auth.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by tempo on 18/09/18.
 */

@RestController
@RequestMapping(RestPaths.AUTH)
public class AuthController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AuthService authService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> authenticatorToken(@RequestBody Map<String, Object> data){
        log.info("Ini authenticatorToken: " + data);
        String apiKey =  (String) data.get(Constants.X_API_KEY);
        log.info("Api Key to validate: " + apiKey);
        return authService.validateToken(apiKey);
    }
}
