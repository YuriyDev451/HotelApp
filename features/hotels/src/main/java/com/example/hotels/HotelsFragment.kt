package com.example.hotels

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.hotels.databinding.FragmentHotelsBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HotelsFragment : Fragment() {
    lateinit var binding: FragmentHotelsBinding

    val viewModel: HotelsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHotelsBinding.inflate(inflater)

        binding.button2.setOnClickListener {
            lifecycleScope.launch{
                viewModel.getFlights()
            }

        }

        return binding.root
    }


}