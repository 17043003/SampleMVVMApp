package com.ishzk.android.samplemvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.ishzk.android.samplemvvmapp.databinding.ActivityMainBinding
import com.ishzk.android.samplemvvmapp.model.News
import com.ishzk.android.samplemvvmapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel

        val observer = Observer<News>{
            val newsTextView: TextView = findViewById(R.id.newsText)
            val newsContentTextView: TextView = findViewById(R.id.newsContentText)
            newsTextView.text = it.title
            newsContentTextView.text = it.content
        }
        viewModel.newsLiveData.observe(this, observer)
    }
}