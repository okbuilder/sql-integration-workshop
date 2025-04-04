package com.example.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SayHello {

    @GetMapping("/")
    fun hello(): String {
        return "Hello, World!"
    }
}