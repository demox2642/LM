package com.skilbox.leroymerlin.data.category_adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.category_view_for_list.view.*

abstract class BaseHolder(
    view: View
) : RecyclerView.ViewHolder(view), LayoutContainer {

    init {
    }

    protected fun bindMainInfo(
        category_name: String
    ) {

        itemView.category_name_text.text = category_name
    }
}
