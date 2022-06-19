package com.ishzk.android.samplemvvmapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ishzk.android.samplemvvmapp.model.News

class MainViewModel(): ViewModel() {
    val newsLiveData: MutableLiveData<News> by lazy { MutableLiveData() }

    fun fetchNews(){
        newsLiveData.value = News(title = "sample title", content = "test content")
    }
}