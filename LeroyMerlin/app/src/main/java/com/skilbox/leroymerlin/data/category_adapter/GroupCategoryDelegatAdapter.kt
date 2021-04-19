package com.skilbox.leroymerlin.data.category_adapter

import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.skilbox.leroymerlin.R
import com.skilbox.leroymerlin.data.ItemsForView
import com.skilbox.networking.data.network.adapter.inflate

class GroupCategoryDelegatAdapter :
    AbsListItemAdapterDelegate<ItemsForView.GroupCategory,
        ItemsForView,
        GroupCategoryDelegatAdapter.GroupCategoryHolder>() {

    class GroupCategoryHolder(
        view: View
    ) : BaseHolder(view) {

        fun bind(category: ItemsForView.GroupCategory) {
            bindMainInfo(category_name = category.name)
        }

        override val containerView: View
            get() = itemView
    }

    override fun isForViewType(item: ItemsForView, items: MutableList<ItemsForView>, position: Int): Boolean {
        return item is ItemsForView.GroupCategory
    }

    override fun onCreateViewHolder(parent: ViewGroup): GroupCategoryHolder {
        return GroupCategoryHolder(parent.inflate(R.layout.group_category))
    }

    override fun onBindViewHolder(
        item: ItemsForView.GroupCategory,
        holder: GroupCategoryHolder,
        payloads: MutableList<Any>
    ) {
        holder.bind(item)
    }
}
