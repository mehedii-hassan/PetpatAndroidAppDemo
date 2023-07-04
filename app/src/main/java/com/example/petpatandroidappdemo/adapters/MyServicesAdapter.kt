package com.example.petpatandroidappdemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.petpatandroidappdemo.databinding.RvBeautyServiceItemBinding
import com.example.petpatandroidappdemo.databinding.RvManageServicesItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvProductsItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvReviewItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvServicesItemDesignBinding

class MyServicesAdapter(private val list: ArrayList<Int>) :
    RecyclerView.Adapter<MyServicesAdapter.MyServiceViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyServiceViewHolder {
        val binding = RvManageServicesItemDesignBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MyServiceViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun deleteItem(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }


    override fun onBindViewHolder(holder: MyServiceViewHolder, position: Int) {


    }


    inner class MyServiceViewHolder(val binding: RvManageServicesItemDesignBinding) :
        ViewHolder(binding.root) {

    }

}