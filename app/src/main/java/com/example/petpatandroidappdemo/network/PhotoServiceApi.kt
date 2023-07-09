package com.example.petpatandroidappdemo.network

import com.example.petpatandroidappdemo.models.AddProductModel
import com.example.petpatandroidappdemo.models.gallery.PhotoModel
import com.example.petpatandroidappdemo.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PhotoServiceApi {


    /*@GET("/items")
    suspend fun getPhotos(): List<AddProductModel.Image>
    */
    @Headers("Authorization: Client-ID " + Constants.PHOTOS_API_KEY)
    @GET("photos")
    fun getImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<List<PhotoModel>>

}