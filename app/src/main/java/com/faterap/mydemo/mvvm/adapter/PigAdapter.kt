package com.faterap.mydemo.mvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.faterap.mydemo.R
import com.faterap.mydemo.databinding.PigItemViewBinding
import com.faterap.mydemo.mvvm.data.Pig

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm.adapter
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/26/2019, tanminghui, Create file
 */
class PigAdapter(private val context: Context) : RecyclerView.Adapter<PigAdapter.ViewHolder>() {

    var data: List<Pig> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.pig_item_view,
                null,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(private val binding: PigItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Pig) {
            binding.apply {
                pig = item
                executePendingBindings()
            }
        }
    }
}