package com.jeonhui.baseserver.controllers

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import com.jeonhui.baseserver.models.*
import org.springframework.http.HttpStatus

@Controller
@RequestMapping("/")
class TempController {

    @GetMapping("")
    fun main(): ResponseEntity<*> {
        return ResponseEntity.ok("ok!")
    }

    @GetMapping("/id")
    fun user(id: String): ResponseEntity<User> {
        return if (id.isNotBlank()) {
            ResponseEntity.ok(User("id", "name", "dlwjsgml02@naver.com"))
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}