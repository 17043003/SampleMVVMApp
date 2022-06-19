package com.ishzk.android.samplemvvmapp.viewmodel

import androidx.lifecycle.ViewModel
import com.ishzk.android.samplemvvmapp.model.News

class MainViewModel(): ViewModel() {
    fun fetchNews(): News{
        return News(title = "sample title", content = "test content")
    }
}