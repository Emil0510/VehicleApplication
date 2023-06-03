package com.emilabdurahmanli.viewdataapplication.api

import retrofit2.Call
import com.emilabdurahmanli.viewdataapplication.model.Result
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {


    @GET("api/vehicles/getallmanufacturers")
    fun getAllManufactures(@Query("format") format : String) : Call<Result>




}