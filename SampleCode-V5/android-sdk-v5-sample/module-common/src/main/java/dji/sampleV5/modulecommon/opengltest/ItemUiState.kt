package dji.sampleV5.modulecommon.opengltest

import androidx.recyclerview.widget.DiffUtil

sealed class ItemUiState(
    val itemId: Any
) {
    data class GIF(
        val title: CharSequence,
        val imageRes: Int,
    ) : ItemUiState(title)

    companion object {
        val DIFF = object : DiffUtil.ItemCallback<ItemUiState>() {
            override fun areItemsTheSame(oldItem: ItemUiState, newItem: ItemUiState) =
                oldItem.itemId == newItem.itemId

            override fun areContentsTheSame(oldItem: ItemUiState, newItem: ItemUiState) =
                oldItem == newItem
        }
    }
}