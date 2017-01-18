package com.springboot.controller

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.springboot.model.User
import com.springboot.server.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation

@Api(value="用户相关的接口")
@RestController
@RequestMapping("/user")
class UserController {

	@Autowired
	lateinit var userService : UserService

    @RequestMapping(value="/find")
    @ApiOperation(notes="查找用户",value="查找用户",httpMethod="POST")
    @ApiImplicitParams(ApiImplicitParam(name = "id", paramType = "query", dataType = "long"))
    fun find (user : User) : JSONObject {
//        println(user.mobile ?: "empty")
        return JSON.toJSON(userService.findUserById(user.id)) as JSONObject
    }
}