package com.skilbox.leroymerlin.product_adapter

import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.skilbox.leroymerlin.R
import com.skilbox.leroymerlin.data.Product
import com.skilbox.networking.data.network.adapter.inflate

class ProductDelegateAdapter :
    AbsListItemAdapterDelegate<Product, Product, ProductDelegateAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup): ProductViewHolder {
        return ProductViewHolder(parent.inflate(R.layout.product_view_for_list))
    }

    class ProductViewHolder(view: View) : ProductBaseHolder(view) {

        fun bind(product: Product) {
            bindMainInfo(
                product_name = product.name,
                product_price = product.price,
                product_image = product.imageLinc
            )
        }
        override val containerView: View
            get() = itemView
    }

    override fun isForViewType(
        item: Product,
        items: MutableList<Product>,
        position: Int
    ): Boolean {
        return true
    }

    override fun onBindViewHolder(
        item: Product,
        holder: ProductViewHolder,
        payloads: MutableList<Any>
    ) {
        holder.bind(item)
    }
}
