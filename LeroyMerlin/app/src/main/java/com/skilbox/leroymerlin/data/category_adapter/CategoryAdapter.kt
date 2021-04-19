package com.skilbox.leroymerlin.data.category_adapter

import androidx.recyclerview.widget.DiffUtil
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import com.skilbox.leroymerlin.data.ItemsForView

class CategoryAdapter : AsyncListDifferDelegationAdapter<ItemsForView>(CategoryDiffUtilCallBack()) {
    init {
        delegatesManager.addDelegate(CategoryDelegateAdapter())
            .addDelegate(GroupCategoryDelegatAdapter())
    }

    class CategoryDiffUtilCallBack : DiffUtil.ItemCallback<ItemsForView>() {
        override fun areItemsTheSame(oldItem: ItemsForView, newItem: ItemsForView): Boolean {
            return when {
                oldItem is ItemsForView.GroupCategory && newItem is ItemsForView.GroupCategory -> oldItem.id == newItem.id
                oldItem is ItemsForView.Category && newItem is ItemsForView.Category -> oldItem.id == newItem.id
                else -> false
            }
        }

        override fun areContentsTheSame(oldItem: ItemsForView, newItem: ItemsForView): Boolean {
            return oldItem == newItem
        }
    }
}
