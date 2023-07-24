package com.example.newsapp_ui.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.Dispatchers

class CustomViewModelFactory(private val mContext : Context) : ViewModelProvider.NewInstanceFactory() {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return SharedViewModel(
            DataRepository(
                NetworkService(NetworkResolver.getNetworkInstance(mContext)),
                Dispatchers.IO
            ),
            Dispatchers.IO
        ) as T
    }
}