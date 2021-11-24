package com.db.sld.controller;

import com.db.sld.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/{id}")
public class UserController {
    @GetMapping
    public ResponseEntity<User> getUser(@PathVariable("id") String userId) {
        return ResponseEntity.ok(User.builder().name("Amazing user name").build());
    }
}
