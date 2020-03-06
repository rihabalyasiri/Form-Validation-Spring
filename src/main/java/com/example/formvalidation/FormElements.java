package com.example.formvalidation;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class FormElements {

    @NotEmpty
    private String name;
    @NotBlank
    private String job;
    @NumberFormat
    private int age;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String adresse;
    @NotBlank
    private String phone;

    private String error = "Pleas enter a valid input";


    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setError(String nameError) {
        this.error = nameError;
    }


    public String getError() {
        return error;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPhone() {
        return phone;
    }
}
