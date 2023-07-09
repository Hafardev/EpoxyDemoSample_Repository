package com.example.epoxydemo.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.epoxydemo.controller.EpoxyDemoController
import com.example.epoxydemo.dataClass.BaseModel
import com.example.epoxydemo.mockDataRepository.DataSource


class EpoxyDemoViewModel : ViewModel(), EpoxyDemoController.EpoxyControllerListener {
        val uiControllerLiveData by lazy { MutableLiveData<List<BaseModel>>() }
        private val repository by lazy { DataSource() }

        init {
            setupUIItems()
        }

        override fun onItemClick(itemId: String) {
            Log.i("Epoxy", "onItemClick:$itemId")
        }

        private fun setupUIItems() {
            uiControllerLiveData.postValue(repository.provideDataSource())
        }


    }
