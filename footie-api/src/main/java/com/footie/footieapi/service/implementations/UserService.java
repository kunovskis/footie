package com.footie.footieapi.service.implementations;

import com.footie.footieapi.model.User;
import com.footie.footieapi.persistence.UserRepository;
import com.footie.footieapi.service.interfaces.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface{

    @Autowired
    private UserRepository userRepository;

    public User addUser(User newUser){
        userRepository.save(newUser);
        return newUser;
    }
}
