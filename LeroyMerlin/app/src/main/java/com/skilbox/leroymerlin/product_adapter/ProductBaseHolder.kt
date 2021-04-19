package com.skilbox.leroymerlin.product_adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.category_view_for_list.view.*
import kotlinx.android.synthetic.main.product_view_for_list.view.*
import java.text.DecimalFormat
import java.text.NumberFormat

abstract class ProductBaseHolder(
    view: View
) : RecyclerView.ViewHolder(view), LayoutContainer {

    init {
    }

    protected fun bindMainInfo(
        product_name: String,
        product_price: Double,
        product_image: String

    ) {

        itemView.product_name_view.text = product_name.substring(0, 25) + "..."
        val nf: NumberFormat = DecimalFormat("###,###.##")

        val price_text = nf.format(product_price).replace(",", " ") + " \u20BD/шт"
        itemView.product_price_view.text = price_text

        Glide.with(itemView.product_image_view)
            .load(product_image)
            .into(itemView.product_image_view)
            .view
    }
}
