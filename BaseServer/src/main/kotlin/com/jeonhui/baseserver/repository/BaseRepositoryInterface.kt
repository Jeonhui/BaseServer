package com.jeonhui.baseserver.repository

import com.jeonhui.baseserver.domain.BaseModel

interface BaseRepositoryInterface {
    fun save(baseModel: BaseModel): BaseModel
    fun findById(id: Long): BaseModel?
    fun findByName(name: String): BaseModel?
    fun findAll(): List<BaseModel>
}