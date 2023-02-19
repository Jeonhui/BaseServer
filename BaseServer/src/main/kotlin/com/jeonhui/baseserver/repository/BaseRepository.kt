package com.jeonhui.baseserver.repository

import com.jeonhui.baseserver.domain.BaseModel
import org.springframework.stereotype.Repository

@Repository
class BaseRepository: BaseRepositoryInterface  {
    private var store: MutableMap<Long, BaseModel> = mutableMapOf()
    private var sequence: Long = 0L

    override fun save(baseModel: BaseModel): BaseModel {
        baseModel.setId(++sequence)
        store[baseModel.id] = baseModel
        return baseModel
    }

    override fun findById(id: Long): BaseModel? {
        return store[id]
    }

    override fun findByName(name: String): BaseModel? {
        return store.values.firstOrNull { member -> member.name == name }
    }

    override fun findAll(): List<BaseModel> {
        return store.values.toList()
    }
}