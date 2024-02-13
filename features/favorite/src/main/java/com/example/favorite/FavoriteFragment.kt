package com.example.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.common.base.BaseFragment
import com.example.favorite.databinding.FragmentFavoriteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>(FragmentFavoriteBinding::inflate) {



    val viewModel: FavoriteViewModel by viewModels()

    private lateinit var favoriteAdapter: FavoriteAdapter



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerAdapter()

        viewModel.getAll().observe(viewLifecycleOwner) { items ->
            favoriteAdapter.setData(items)
        }
    }

    private fun initRecyclerAdapter(){
        favoriteAdapter = FavoriteAdapter()


        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = favoriteAdapter

        val callback = object: ItemTouchHelper.SimpleCallback(
            0,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                val item = favoriteAdapter.differ.currentList[position]
                viewModel.delete(item)
                favoriteAdapter.removeItem(position)
            }

        }
        val itemTouchHelper = ItemTouchHelper(callback)
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }


}