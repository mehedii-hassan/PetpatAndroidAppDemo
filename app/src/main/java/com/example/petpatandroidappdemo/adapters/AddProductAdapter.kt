package com.example.petpatandroidappdemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.petpatandroidappdemo.R
import com.example.petpatandroidappdemo.callbacks.AddProductItemSelectListener
import com.example.petpatandroidappdemo.databinding.RvAddProductItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvBeautyServiceItemBinding
import com.example.petpatandroidappdemo.databinding.RvManageServicesItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvProductsItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvReviewItemDesignBinding
import com.example.petpatandroidappdemo.databinding.RvServicesItemDesignBinding
import com.example.petpatandroidappdemo.ui.fragments.dialogfragments.OrderDetailsDialogFragment
import com.example.petpatandroidappdemo.ui.fragments.dialogfragments.UploadOptionDialogFragment

class AddProductAdapter(private val list: ArrayList<Int>, fragment: Fragment) :
    RecyclerView.Adapter<AddProductAdapter.AddProductViewHolder>() {
    private val itemClickListener = fragment as AddProductItemSelectListener


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddProductViewHolder {
        val binding = RvAddProductItemDesignBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return AddProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    override fun onBindViewHolder(holder: AddProductViewHolder, position: Int) {

        holder.bind(position)

    }


    inner class AddProductViewHolder(val binding: RvAddProductItemDesignBinding) :
        ViewHolder(binding.root) {


        fun bind(position: Int) {

            binding.ivUpload.setOnClickListener {
                itemClickListener.getAddProductItemPosition(position, binding)

            }
        }
    }

}