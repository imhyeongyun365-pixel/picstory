package com.example.demo.web.dto;

public record SignupRequest (
        String name,
        String email,
        String password,
        String passwordConfirm,
        String phone)
{}
