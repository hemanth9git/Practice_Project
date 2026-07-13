package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.model.Registration;
import com.hemanthit.practice_project.repository.RegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl {

    RegistrationRepository repository;

    public Registration saveNewUserDetails(Registration registration) {
      return repository.save(registration);
    }
}
