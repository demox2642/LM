package com.skilbox.leroymerlin.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CaregoryViewModel : ViewModel() {

    private val categoryRepository = CategoryRepository()
    private val categoryMutableLiveData = MutableLiveData <List<ItemsForView>>()

    val categoryLiveData: LiveData<List<ItemsForView>>
        get() = categoryMutableLiveData

    fun loadCategoryList() {
        categoryMutableLiveData.postValue(categoryRepository.getCategoryList())
    }
}
