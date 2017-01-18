package com.springboot.server.impl

import com.springboot.model.User
import com.springboot.model.mapper.UserMapper
import com.springboot.server.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired
    lateinit var userMapper: UserMapper

    override fun findUserById(id: Long): User {
        return userMapper.selectByPrimaryKey(id)
    }

}