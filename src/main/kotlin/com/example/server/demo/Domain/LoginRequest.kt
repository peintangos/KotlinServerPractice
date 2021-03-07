package com.example.server.demo.Domain

import java.io.Serializable

data class LoginRequest(var name:String,var password:String):Serializable {
}