package com.crodriguezt.dev.auth.auth.service;

import java.util.Map;

/**
 * Created by tempo on 18/09/18.
 */
public interface AuthService {

    Map<String, Object> validateToken(String apiKey);
}
