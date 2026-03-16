package com.application.catalog.resources;

import com.application.catalog.entities.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User("trabalhosdabia@gmail.com", 1L, "Ana", "123", "999999999");
        return ResponseEntity.ok().body(u);
    }

}
