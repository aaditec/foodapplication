package com.example.tour_guide_nepal.API

import com.example.tour_guide_nepal.ENTITY.HotelBookDetails
import com.example.tour_guide_nepal.Response.BookHotelResponse
import com.example.tour_guide_nepal.Response.DeleteBookHotelResponse
import com.example.tour_guide_nepal.Response.GetAllBookHotelResponse
import com.example.tour_guide_nepal.Response.UpdateBookHotelResponse
import retrofit2.Response
import retrofit2.http.*

interface HotelBookAPI {
    //Book hotel
    @POST("userhotel/insert")
    suspend fun bookHotel(
        @Header("Authorization") token:String,
        @Body hotelBookDetails: HotelBookDetails
    ): Response<BookHotelResponse>

    //Delete Book
    @DELETE("userhotel/delete/{id}")
    suspend fun deletebookHotel(
        @Header("Authorization") token: String,
        @Path("id")id:String
    ):Response<DeleteBookHotelResponse>

    //Get all Book hotel
    @GET("userhotel/all")
    suspend fun getallBookHotel(
        @Header("Authorization") token:String
    ):Response<GetAllBookHotelResponse>

    //Update Hotel Book
    @PUT("userhotel/update/{id}")
    suspend fun updateBookHotel(
        @Header("Authorization") token:String,
        @Path("id") id:String,
        @Body hotelBookDetails: HotelBookDetails
    ):Response<UpdateBookHotelResponse>
}