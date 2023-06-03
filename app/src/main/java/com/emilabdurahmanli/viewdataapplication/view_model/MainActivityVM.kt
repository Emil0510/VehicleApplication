package com.emilabdurahmanli.viewdataapplication.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emilabdurahmanli.viewdataapplication.Constants
import com.emilabdurahmanli.viewdataapplication.model.Result
import com.emilabdurahmanli.viewdataapplication.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityVM : ViewModel() {

    var result = MutableLiveData<Result>()

    fun getAllManufactures(){
        val call = RetrofitClient.getRetrofitInstance()?.getApi()?.getAllManufactures(Constants.FORMAT)
        call?.enqueue(object : Callback<Result>{
            override fun onResponse(call: Call<Result>, response: Response<Result>) {
                result.postValue(response.body())
            }

            override fun onFailure(call: Call<Result>, t: Throwable) {

            }

        })
    }
    fun observeResult() : LiveData<Result>{
        return result
    }

}