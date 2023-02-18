package com.jeonhui.baseserver.models

class User {
    val id: String
    val name: String
    val email: String

    constructor(id: String, name: String, email: String) {
        this.id = id
        this.name = name
        this.email = email
    }

}