package com.jeonhui.baseserver.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import com.jeonhui.baseserver.domain.*
import com.jeonhui.baseserver.service.BaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus

@Controller
@RequestMapping("/")
class BaseController {
    private val baseService: BaseService

    @Autowired
    constructor(baseService: BaseService) {
        this.baseService = baseService
    }

    @GetMapping("")
    fun main(): ResponseEntity<String> {
        return ResponseEntity.ok("Base Server")
    }

    @GetMapping("/id")
    fun user(id: Long): ResponseEntity<BaseModel> {
       val user = baseService.findOne(id) ?: return ResponseEntity(HttpStatus.NOT_FOUND)
        return ResponseEntity.ok(user)
    }
}