package com.example.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

open abstract class BaseFragment<B: ViewBinding>(private val inflate: Inflate<B>): Fragment() {

    private var _binding: B? = null

    protected val binding: B
        get() = _binding as B


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return _binding?.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}