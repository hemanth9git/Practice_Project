package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.model.Registration;
import com.hemanthit.practice_project.serviceImpl.RegistrationServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registration")
@AllArgsConstructor
public class ResgistrationController {

    RegistrationServiceImpl servcie;

    @PostMapping("saveUser")
    public ResponseEntity<Registration> saveNewUserDetails(@RequestBody Registration registration){
        com.hemanthit.practice_project.model.Registration savedUser =servcie.saveNewUserDetails(registration);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }
}
