package com.jeonhui.baseserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BaseServerApplication

fun main(args: Array<String>) {
    runApplication<BaseServerApplication>(*args)
}
