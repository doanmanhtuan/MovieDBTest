package com.example.myapplication.screen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.model.ResponseMovie
import com.example.myapplication.service.APIService
import com.example.myapplication.service.ApiUtil
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class ListPopularFragment : Fragment() {

    lateinit var mAPIService: APIService
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAPIService = ApiUtil.getApiService()
        getListPopularMovie()
    }

    fun getListPopularMovie() {

        mAPIService.getPopularMovie()
            .enqueue(object : Callback<ResponseMovie?> {
                override fun onResponse(
                    call: Call<ResponseMovie?>?,
                    response: Response<ResponseMovie?>
                ) {
                    if (response.isSuccessful) {
                        Log.d("MainActivity", "response: " + response.body().toString())
                    } else {
                        /* Todo */
                    }
                }

                override fun onFailure(
                    call: Call<ResponseMovie?>?,
                    t: Throwable?
                ) {
                    Toast.makeText(context, "Connect fail", Toast.LENGTH_SHORT).show()
                }
            })
    }

    companion object {
        fun newInstance(): ListPopularFragment {
            return ListPopularFragment()
        }
    }
}