package com.multilevel.inheritance.handler;

import com.multilevel.inheritance.domain.Landlord;
import com.multilevel.inheritance.service.UserService;
import com.sample.inheritance.model.UserModel;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserHandler {


    private final UserService userService;

    @Autowired
    public UserHandler(UserService userService) {
        this.userService = userService;
    }


    public void save(UserModel userModel) {
        userService.save(transformer(userModel));

    }

    private Landlord transformer(UserModel userModel) {
        Landlord landlord = new Landlord();
        landlord.setId(UUID.randomUUID());
        landlord.setAddress(userModel.getAddress());
        landlord.setEmail(userModel.getEmail());
        landlord.setName(userModel.getName());
        landlord.setPhone(userModel.getPhone());
        landlord.setSignUpDate(DateTime.now());
        landlord.setStatus("Active");
        return landlord;


    }
}
