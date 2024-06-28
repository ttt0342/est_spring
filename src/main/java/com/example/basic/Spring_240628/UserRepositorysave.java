package com.example.basic.Spring_240628;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositorysave implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("User1 saved");
    }

    @Override
    public void delete(User user) {
        System.out.println("User1 deleted");
    }
}
