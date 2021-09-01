package com.example.tour_guide_nepal.API

import com.example.tour_guide_nepal.ENTITY.VehicleRentEntity
import com.example.tour_guide_nepal.Response.*
import retrofit2.Response
import retrofit2.http.*

interface VehicleRentApi {
    //rent vehicle
    @POST("uservehicle/insert")
    suspend fun rentvehicle(
        @Header("Authorization")token:String,
        @Body vehicleRentEntity: VehicleRentEntity
    ): Response<VehicleRentResponse>

    //update vehicle rent
    @PUT("uservehicle/update/{id}")
    suspend fun updatevehclerent(
        @Header("Authorization") token: String,
        @Path("id") id:String,
        @Body vehicleRentEntity: VehicleRentEntity
    ): Response<UpdateVehicleRentResponse>

    //Get all vehicle Rent
    @GET("uservehicle/all")
    suspend fun getallvehiclerent(
        @Header("Authorization") token: String
    ): Response<GetAllVehicleRentResponse>

    //Delete Book
    @DELETE("uservehicle/delete/{id}")
    suspend fun deletevehiclerent(
        @Header("Authorization") token: String,
        @Path("id")id:String
    ):Response<DeleteVehicleRentResponse>

}