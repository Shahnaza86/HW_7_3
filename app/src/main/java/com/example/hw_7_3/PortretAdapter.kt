package com.example.hw_7_3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_7_3.databinding.ItemPortretsBinding

class PortretAdapter(val list:ArrayList<Item>,val onClick:(position:Int)->Unit):RecyclerView.Adapter<PortretAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPortretsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
       return list.size

    }

    inner class ViewHolder( private val binding: ItemPortretsBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.imageView.setImageResource(item.image)
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
            binding.text1.text=item.name
            binding.text2.text=item.title

        }

    }

}