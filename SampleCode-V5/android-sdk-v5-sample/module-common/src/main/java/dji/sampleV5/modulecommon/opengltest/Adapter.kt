package dji.sampleV5.modulecommon.opengltest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dji.sampleV5.modulecommon.R

class Adapter(
    private val inflater: LayoutInflater,
) : ListAdapter<ItemUiState, RecyclerView.ViewHolder>(ItemUiState.DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            R.layout.item_image_view ->
                GIFHolder(inflater.inflate(viewType, parent, false))

            else ->
                EmptyViewHolder(inflater.inflate(viewType, parent, false))
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GIFHolder -> holder.bind(getItem(position) as ItemUiState.GIF)
        }
    }

    override fun getItemViewType(position: Int) =
        when (getItem(position)) {
            is ItemUiState.GIF -> R.layout.item_image_view
            else -> android.R.layout.simple_list_item_1
        }
}