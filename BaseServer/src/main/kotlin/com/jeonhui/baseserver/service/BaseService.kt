package com.jeonhui.baseserver.service

import com.jeonhui.baseserver.domain.BaseModel
import com.jeonhui.baseserver.repository.BaseRepositoryInterface
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BaseService {
    private val baseRepositoryInterface: BaseRepositoryInterface

    @Autowired
    constructor(baseRepositoryInterface: BaseRepositoryInterface) {
        this.baseRepositoryInterface = baseRepositoryInterface
    }

    fun join(baseModel: BaseModel): Long? {
        return if (validateDuplicateMember(baseModel)){
            baseRepositoryInterface.save(baseModel)
            baseModel.id
        } else {
            null
        }
    }

    fun findMembers(): List<BaseModel>{
        return baseRepositoryInterface.findAll()
    }

    fun findOne(memberId: Long): BaseModel? {
        return baseRepositoryInterface.findById(memberId)
    }

    private fun validateDuplicateMember(baseModel: BaseModel): Boolean {
        return baseRepositoryInterface.findByName(baseModel.name) == null
    }
}