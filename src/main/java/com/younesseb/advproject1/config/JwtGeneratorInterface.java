package com.younesseb.advproject1.config;
import com.younesseb.advproject1.model.User;
import java.util.Map;

public interface JwtGeneratorInterface {
    Map<String, String> generateToken(User user);
}
