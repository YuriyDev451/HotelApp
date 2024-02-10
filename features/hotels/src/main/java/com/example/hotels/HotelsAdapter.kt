package com.example.hotels

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.entities.uimodel.HotelListUIModel
import com.example.hotels.databinding.FragmentHotelsBinding
import com.example.hotels.databinding.HotelListItemBinding

class HotelsAdapter: RecyclerView.Adapter<HotelsAdapterViewHolder>() {


    private val differ = AsyncListDiffer(this, diffCallback)


    fun setData(items: List<HotelListUIModel>){
        differ.submitList(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelsAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HotelListItemBinding.inflate(inflater, parent, false)
        return HotelsAdapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: HotelsAdapterViewHolder, position: Int) {
        differ.currentList.getOrNull(position)?.let {
            holder.bind(it)
        }
    }

    companion object{
        private val diffCallback = object : DiffUtil.ItemCallback<HotelListUIModel>(){
            override fun areItemsTheSame(
                oldItem: HotelListUIModel,
                newItem: HotelListUIModel
            ): Boolean {
                return oldItem.id==newItem.id
            }

            override fun areContentsTheSame(
                oldItem: HotelListUIModel,
                newItem: HotelListUIModel
            ): Boolean {
                return oldItem==newItem
            }

        }

    }

}

class HotelsAdapterViewHolder(private val binding: HotelListItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(viewModel: HotelListUIModel){

        val url = viewModel.thumbnailImage.replace("/0x0", "")
        Glide.with(binding.root).load(url).into(binding.imageHotel)



        binding.hotelName.text= viewModel.name
        binding.price.text = viewModel.price.toString()
        binding.cityCountry.text = "${viewModel.city}, ${viewModel.country}"
        binding.reviewScoreLocalized.text = viewModel.reviewScore.toString()
        binding.cityCenterDistance.text = viewModel.cityCenterDistance.toString()
        binding.roomsName.text = viewModel.roomName
        binding.address.text = viewModel.cityCenterDistanceName

//        binding.txt.text = viewModel.airlineName
//        binding.root.setOnClickListener{
//            onClick(viewModel)
//
//        }
    }
}
