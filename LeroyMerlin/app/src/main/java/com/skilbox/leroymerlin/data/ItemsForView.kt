package com.skilbox.leroymerlin.data

sealed class ItemsForView {

    data class GroupCategory(
        val id: Int,
        val name: String
    ) : ItemsForView()

    data class Category(
        val id: Int,
        val name: String,
        val image_category: String
    ) : ItemsForView()
}
