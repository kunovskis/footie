package com.footie.footieapi.web;


import com.footie.footieapi.model.User;
import com.footie.footieapi.persistence.UserRepository;
import com.footie.footieapi.service.implementations.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            users = (List<User>) userRepository.findAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return users;
    }

    @PostMapping(produces = "application/json", consumes = MediaType.ALL_VALUE)
    public User addUser(@RequestBody User user) {
        this.userService.addUser(user);
        return user;
    }
}
