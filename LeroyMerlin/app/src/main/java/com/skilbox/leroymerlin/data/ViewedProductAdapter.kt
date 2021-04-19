package com.skilbox.leroymerlin.product_adapter

import androidx.recyclerview.widget.DiffUtil
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import com.skilbox.leroymerlin.data.Product

class ViewedProductAdapter : AsyncListDifferDelegationAdapter<Product>(ProductDiffUtilCallBack()) {
    init {
        delegatesManager.addDelegate(ProductDelegateAdapter())
    }

    class ProductDiffUtilCallBack : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }
    }
}
