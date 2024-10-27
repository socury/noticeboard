package com.noticeboard.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class MainController {

    @GetMapping("/main")
    fun main(): String {
        return "hello world"
    }
}