package com.faterap.mydemo.mvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm.adapter
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 05/05/2019, tanminghui, Create file
 */
abstract class BindingAdapterBase<T : BindingAdapterBase.IItem>(protected val context: Context) :
    RecyclerView.Adapter<BindingAdapterBase.ItemViewHolder>() {
    var data: List<T> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder.create(parent, viewType)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].layoutId()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface IItem {
        fun layoutId(): Int
        fun variableId(): Int
    }

    class ItemViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun create(parent: ViewGroup, viewType: Int): ItemViewHolder {
                return ItemViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        viewType,
                        parent,
                        false
                    )
                )
            }
        }

        fun bind(item: IItem) {
            binding.apply {
                setVariable(item.variableId(), item)
                executePendingBindings()
            }
        }
    }
}