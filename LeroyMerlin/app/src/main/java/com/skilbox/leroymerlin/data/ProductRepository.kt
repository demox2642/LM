package com.skilbox.leroymerlin.data

import android.util.Log

class ProductRepository {
    private val productList = listOf(
        Product(
            id = 15475543,
            name = "Генератор бензиновый Maxcut MC 6500E 5 кВт",
            price = 36990.00,
            imageLinc = "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,w_2000,h_2000,c_pad,b_white,d_photoiscoming.png/LMCode/15475543_01.jpg"
        ),
        Product(
            id = 82983896,
            name = "Керамогранит Euroceramika Карвалио15x60 см 1.35 м² цвет серый",
            price = 730.35,
            imageLinc = "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,w_82,h_82,c_pad,b_white,d_photoiscoming.png/LMCode/82983896.jpg"
        ),
        Product(
            id = 82635034,
            name = "Компрессор масляный Спец КПП-2415А, 24 л, набор аксессуаров",
            price = 6998.00,
            imageLinc = "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,w_2000,h_2000,c_pad,b_white,d_photoiscoming.png/LMCode/82635034_01.jpg"
        ),
        Product(
            id = 14547883,
            name = "Мойка высокого давления Karcher K5 Basic, 145 бар, 500 л/ч, пенное сопло",
            price = 21490.00,
            imageLinc = "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,w_2000,h_2000,c_pad,b_white,d_photoiscoming.png/LMCode/14547883_02.jpg"
        ),
        Product(
            id = 84834909,
            name = "Обои флизелиновые Vog Collection Лилия бежевые 1.06 м 71557-22",
            price = 998.00,
            imageLinc = "https://res.cloudinary.com/lmru/image/upload/f_auto,q_90,w_2000,h_2000,c_pad,b_white,d_photoiscoming.png/LMCode/84834909_i.jpg"
        )
    )

    fun viewedProducts(): List<Product> {
        var viewProduct = mutableListOf<Product>()
        for (i in 0..1) {
            viewProduct.add(productList[i])
        }
        Log.e("Reposit", "$viewProduct")
        return viewProduct
    }
    fun stockProducts(): List<Product> {
        var stockProduct = mutableListOf<Product>()
        for (i in 2 until productList.size) {
            stockProduct.add(productList[i])
        }
        Log.e("Reposit", "$stockProduct")
        return stockProduct
    }
}
