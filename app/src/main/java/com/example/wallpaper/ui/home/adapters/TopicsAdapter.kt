package com.example.wallpaper.ui.home.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaper.data.model.home.ResponseTopics
import com.example.wallpaper.databinding.ItemCategoriesBinding
import com.example.wallpaper.utils.base.BaseDiffUtils
import com.example.wallpaper.utils.loadImage

import javax.inject.Inject

class TopicsAdapter @Inject constructor() : RecyclerView.Adapter<TopicsAdapter.ViewHolder>() {

    private var items = emptyList<ResponseTopics.ResponseTopicsItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = position

    override fun getItemId(position: Int) = position.toLong()

    inner class ViewHolder(private val binding: ItemCategoriesBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: ResponseTopics.ResponseTopicsItem) {
            binding.apply {
                //Image
                item.coverPhoto?.urls?.regular?.let {
                    image.loadImage(it)
                }
                titleTxt.text = item.title
                //Click
                root.setOnClickListener {
                    onItemClickListener?.let {
                        it(item.id!!, item.title!!)
                    }
                }
            }
        }
    }

    private var onItemClickListener: ((String, String) -> Unit)? = null

    fun setOnItemClickListener(listener: (String, String) -> Unit) {
        onItemClickListener = listener
    }

    fun setData(data: List<ResponseTopics.ResponseTopicsItem>) {
        val adapterDiffUtils = BaseDiffUtils(items, data)
        val diffUtils = DiffUtil.calculateDiff(adapterDiffUtils)
        items = data
        diffUtils.dispatchUpdatesTo(this)
    }
}