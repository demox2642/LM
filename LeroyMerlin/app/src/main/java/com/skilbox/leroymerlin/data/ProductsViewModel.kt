package com.skilbox.leroymerlin.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductsViewModel : ViewModel() {

    private val productRepository = ProductRepository()
    private val productViewedMutableLiveData = MutableLiveData <List<Product>>()
    private val productStockMutableLiveData = MutableLiveData <List<Product>>()

    val productViewedLiveData: LiveData<List<Product>>
        get() = productViewedMutableLiveData

    val productStockLiveData: LiveData<List<Product>>
        get() = productStockMutableLiveData

    fun loadViewedProducts() {
        productViewedMutableLiveData.postValue(productRepository.viewedProducts())
    }

    fun loadStockProducts() {
        productStockMutableLiveData.postValue(productRepository.stockProducts())
    }
}
