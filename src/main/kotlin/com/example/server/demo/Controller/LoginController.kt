package com.example.server.demo.Controller

import com.example.server.demo.Domain.LoginRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController{
    @PostMapping("/abc")
    fun login(@RequestBody loginRequest: LoginRequest):LoginRequest{
        return loginRequest
    }
}