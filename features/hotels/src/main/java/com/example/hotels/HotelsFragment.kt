package com.example.hotels

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.common.base.BaseFragment
import com.example.hotels.databinding.FragmentHotelsBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HotelsFragment : BaseFragment<FragmentHotelsBinding>(FragmentHotelsBinding::inflate) {


    val viewModel: HotelsViewModel by viewModels()

    private lateinit var adapter: HotelsAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerAdapter()

        lifecycleScope.launch {
            viewModel.getFlights()
        }




        viewModel.data.observe(viewLifecycleOwner){
            adapter.setData(it?.hotels ?: listOf())
        }


    }

    private fun initRecyclerAdapter(){
        adapter = HotelsAdapter{
            viewModel.insert(it)
        }


        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
    }


}