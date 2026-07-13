package com.hemanthit.practice_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "registration_details")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
    @NotBlank(message = "Username should not be empty...")
    private String username;
    @Email(message = "Enter valid email")
    private String email;
    @Size(min = 8,message = "Password atleast contain 8 letters")
    private String password;
    @Pattern(regexp = "^[0-9]{10}$",message = "Mobile number must contains 10 digits")
    private String mobile;
}
