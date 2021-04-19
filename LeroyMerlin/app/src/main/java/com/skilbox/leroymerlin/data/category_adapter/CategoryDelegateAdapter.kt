package com.skilbox.leroymerlin.data.category_adapter

import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.skilbox.leroymerlin.R
import com.skilbox.leroymerlin.data.ItemsForView
import com.skilbox.networking.data.network.adapter.inflate
import kotlinx.android.synthetic.main.category_view_for_list.view.*

class CategoryDelegateAdapter :
    AbsListItemAdapterDelegate<ItemsForView.Category, ItemsForView, CategoryDelegateAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup): CategoryViewHolder {
        return CategoryViewHolder(parent.inflate(R.layout.category_view_for_list))
    }

    class CategoryViewHolder(view: View) : BaseHolder(view) {

        fun bind(category: ItemsForView.Category) {
            bindMainInfo(
                category_name = category.name
            )

            Glide.with(itemView.category_image_view)
                .load(category.image_category)
                .placeholder(R.drawable.category_icon)
                .into(itemView.category_image_view)
                .view
        }

        override val containerView: View
            get() = itemView
    }

    override fun isForViewType(item: ItemsForView, items: MutableList<ItemsForView>, position: Int): Boolean {
        return item is ItemsForView.Category
    }

    override fun onBindViewHolder(
        item: ItemsForView.Category,
        holder: CategoryViewHolder,
        payloads: MutableList<Any>
    ) {
        holder.bind(item)
    }
}
