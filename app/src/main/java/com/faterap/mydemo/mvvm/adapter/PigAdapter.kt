package com.faterap.mydemo.mvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faterap.mydemo.R
import com.faterap.mydemo.mvvm.data.Pig
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.pig_item_view.*

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
class PigAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var data: List<Pig> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val root = LayoutInflater.from(context).inflate(R.layout.pig_item_view, null)
        return PigViewHolder(root)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder: PigViewHolder = holder as PigViewHolder
        viewHolder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    companion object {
        class PigViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
            LayoutContainer {
            fun bind(pig: Pig) {
                tv_name.text = pig.name
                tv_color.text = pig.color
                tv_weight.text = pig.weight.toString()
            }
        }
    }

}