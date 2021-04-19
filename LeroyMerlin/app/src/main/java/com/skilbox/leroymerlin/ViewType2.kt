package com.skilbox.leroymerlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.skilbox.leroymerlin.data.CaregoryViewModel
import com.skilbox.leroymerlin.data.ProductsViewModel
import com.skilbox.leroymerlin.data.category_adapter.CategoryAdapter
import com.skilbox.leroymerlin.product_adapter.ProductAdapter
import com.skilbox.leroymerlin.product_adapter.ViewedProductAdapter
import kotlinx.android.synthetic.main.view_tipe1_fragment.*

class ViewType2 : Fragment(R.layout.fragment_type2) {

    private val viewModel: CaregoryViewModel by viewModels()
    private var categorytAdapter: CategoryAdapter? = null
    private val productViewModel: ProductsViewModel by viewModels()
    private var productAdapter: ProductAdapter? = null
    private var viewedProductAdapter: ViewedProductAdapter? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindViewModel()
        productViewModel.loadStockProducts()
        productViewModel.loadViewedProducts()
        viewModel.loadCategoryList()
        initCategoryList()
        initProductLists()
        var badge = bottom_navigation.getOrCreateBadge(R.id.navigation_basket)
        badge.isVisible = true
        badge.number = 6
    }

    private fun bindViewModel() {
        viewModel.categoryLiveData.observe(viewLifecycleOwner) { categorytAdapter?.items = it }
        productViewModel.productStockLiveData.observe(viewLifecycleOwner) { productAdapter?.items = it }
        productViewModel.productViewedLiveData.observe(viewLifecycleOwner) { viewedProductAdapter?.items = it }
    }

    private fun initCategoryList() {
        categorytAdapter = CategoryAdapter()
        with(category_view) {
            adapter = categorytAdapter
            layoutManager = GridLayoutManager(
                requireContext(),
                1,
                GridLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }
    }

    private fun initProductLists() {
        viewedProductAdapter = ViewedProductAdapter()

        with(viewed_product_view) {
            adapter = viewedProductAdapter
            layoutManager = GridLayoutManager(
                requireContext(),
                1,
                GridLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }

        productAdapter = ProductAdapter()
        with(stock_product_view) {
            adapter = productAdapter
            layoutManager = GridLayoutManager(
                requireContext(),
                1,
                GridLayoutManager.HORIZONTAL,
                false
            )
            setHasFixedSize(true)
        }
    }
}
