package com.example.basic.Spring_240701;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String key){
        User user = userRepository.getUser(key);
        System.out.println("오오오오오징어"); // 비즈니스 로직
        return user;
    }
}
