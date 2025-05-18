// src/main/java/com/trend/TrendAgain/controller/AuthController.java
package com.trend.TrendAgain.controller;

import com.trend.TrendAgain.model.UserLoginRequest;
import com.trend.TrendAgain.model.User;
import com.trend.TrendAgain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginRequest loginRequest) {
        User user = userService.getUserByUsername(loginRequest.getUsername());
        if (user == null) {
            return ResponseEntity.status(401).body("Usuario no encontrado");
        }
        if (user.getPasswordHash().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).body("Contraseña incorrecta");
        }
    }
}

