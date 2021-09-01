package com.food.foodsensations.Repository

import com.food.foodsensations.API.MyApiRequest
import com.food.foodsensations.API.ServiceBuilder
import com.food.foodsensations.API.UserAPI
import com.food.foodsensations.ENTITY.User
import com.food.foodsensations.Response.LoginResponse

class UserRepository:  MyApiRequest() {
    private val userAPI = ServiceBuilder.buildService(UserAPI::class.java)

    //Register User
    suspend fun registerUser(user: User) : LoginResponse {
        return apiRequest {
            userAPI.registerUser(user)
        }
    }

    //login User
    suspend fun loginUser(email:String, password:String):LoginResponse{
        return apiRequest {
            userAPI.checkUser(email, password)
        }
    }

}




