package com.springboot.server

import com.springboot.model.User

interface UserService {

    fun findUserById(id: Long): User

}