package com.priyam.notesapp.api

import com.priyam.notesapp.models.UserRequest
import com.priyam.notesapp.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface UserAPI {

    @POST("/users/signup")
    suspend fun signup(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST("/users/signin")
    suspend fun signin(@Body userRequest: UserRequest) : Response<UserResponse>

}


//MainActivity >> MainFragment >> Register Fragment >> AuthViewModel >> UserRepository >>  UserApi (signup)
// MainActivity >> MainFragment >> Login Fragment >> AuthViewModel >> UserRepository >>  UserApi (signin)