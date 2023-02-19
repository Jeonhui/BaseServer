package com.jeonhui.baseserver.domain


class BaseModel {
    var id: Long
        private set
    var name: String
        private set

    constructor(id: Long = 0, name: String) {
        this.id = id
        this.name = name
    }

    fun setId(id: Long) {
        this.id = id
    }
}