package com.skilbox.leroymerlin.data

class CategoryRepository {
    val categotyList = listOf(
        ItemsForView.GroupCategory(id = 1, name = "Каталог"),

        ItemsForView.Category(

            id = 1,
            name = "Стройматериалы",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-1.jpg"

        ),
        ItemsForView.Category(
            id = 2,
            name = "Инструменты",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-2.jpg"
        ),

        ItemsForView.Category(
            id = 3,
            name = "Водоснабжение",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-3.jpg"
        ),

        ItemsForView.Category(
            id = 4,
            name = "Декор",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-4.jpg"
        ),

        ItemsForView.Category(
            id = 5,
            name = "Столярные изделия",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-5.jpg"
        ),
        ItemsForView.Category(
            id = 6,
            name = "Напольные покрытия",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-6.jpg"
        ),
        ItemsForView.Category(
            id = 7,
            name = "Сад",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-7.jpg"
        ),

        ItemsForView.Category(
            id = 8,
            name = "Освещение",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-8.jpg"
        ),

        ItemsForView.Category(
            id = 9,
            name = "Окна и двери",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-9.jpg"
        ),

        ItemsForView.Category(
            id = 10,
            name = "Плитка",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-10.jpg"
        ),

        ItemsForView.Category(
            id = 11,
            name = "Скобяные изделия",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-11.jpg"
        ),

        ItemsForView.Category(
            id = 12,
            name = "Хранение",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-12.jpg"
        ),

        ItemsForView.Category(
            id = 13,
            name = "Электротовары",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-13.jpg"
        ),

        ItemsForView.Category(
            id = 14,
            name = "Сантехника",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-14.jpg"
        ),

        ItemsForView.Category(
            id = 15,
            name = "Краски",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-15.jpg"
        ),

        ItemsForView.Category(
            id = 16,
            name = "Кухни",
            image_category = "https://res.cloudinary.com/lmru-test/image/upload/f_auto,q_90,c_pad,b_white,d_photoiscoming.png/elbrus/images/Landings/plan-do-live/catalogue/catalogue-16.jpg"
        )
    )

    fun getCategoryList(): List<ItemsForView> {
        return categotyList
    }
}
