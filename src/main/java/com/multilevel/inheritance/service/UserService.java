package com.multilevel.inheritance.service;

import com.multilevel.inheritance.domain.Landlord;
import com.multilevel.inheritance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(Landlord landlord) {
        userRepository.save(landlord);

    }
}
