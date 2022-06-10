package com.nathit.two_way_databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel:ViewModel() {

    val userName = MutableLiveData<String>()
    val description = MutableLiveData<String>()

    init {
        userName.value = "Nathit Panrod"
        description.value = "Android Dev"
    }
}