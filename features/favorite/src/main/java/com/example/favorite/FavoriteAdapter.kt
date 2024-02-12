package com.example.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.entities.uimodel.HotelListUIModel
import com.example.favorite.databinding.HotelListBinding


class FavoriteAdapter(
) : RecyclerView.Adapter<FavoriteAdapter.ViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<HotelListUIModel>() {
        override fun areItemsTheSame(oldItem: HotelListUIModel, newItem: HotelListUIModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: HotelListUIModel, newItem: HotelListUIModel): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, differCallback)

    fun setData(items: List<HotelListUIModel>) {
        differ.submitList(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HotelListBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setPadding(0,0,0,0)

        holder.bind(differ.currentList[position])


    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ViewHolder(private val binding: HotelListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: HotelListUIModel) {
            binding.apply {
                // Bind your item data here, e.g.,
                val url = item.thumbnailImage.replace("/0x0", "")
                Glide.with(root.context).load(url).into(binding.imageHotel)
               // textViewTitle.text = item.title
               // binding..text = item.price.toString()

                binding.price.text = item.price.toString()


                binding.hotelName.text= item.name
                //binding.price.text = item.price.toString()
                binding.cityCountry.text = "${item.city}, ${item.country}"
                binding.reviewScoreLocalized.text = item.reviewScore.toString()
                binding.cityCenterDistance.text = item.cityCenterDistance.toString()
                binding.roomsName.text = item.roomName
                binding.address.text = item.cityCenterDistanceName

            }
        }
    }
}