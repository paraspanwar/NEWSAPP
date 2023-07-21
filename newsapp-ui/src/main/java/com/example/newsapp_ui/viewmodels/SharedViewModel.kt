package com.example.newsapp_ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.newsapp_data.repository.DataRepository
import kotlinx.coroutines.CoroutineDispatcher

open class SharedViewModel(
    private val mDataRepository: DataRepository,
    private val mCoroutineDispatcher: CoroutineDispatcher): ViewModel() {



}