package com.sazzler.ecommerce.sazzler_api_def.auth_service.DTO;
import java.time.LocalDate;
import java.util.Date;

public record UserRegReq(
String username,
String password,
String email,
String firstName,
String lastName,
LocalDate dob,
String role
)
{}
