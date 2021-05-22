package com.example.demo.Service;

import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    private UserRepository userrepository;

    @Autowired
    public UserService(UserRepository userrepository){
        this.userrepository = userrepository;
    }



}
