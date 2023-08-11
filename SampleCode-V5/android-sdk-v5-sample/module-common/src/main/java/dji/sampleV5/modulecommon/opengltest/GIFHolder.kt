package dji.sampleV5.modulecommon.opengltest

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dji.sampleV5.modulecommon.R

class GIFHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val textView = itemView.findViewById<TextView>(R.id.textView)
    private val imageView = itemView.findViewById<ImageView>(R.id.imageView)

    fun bind(item: ItemUiState.GIF) {
        textView.text = item.title
        Glide.with(imageView).load(item.imageRes).into(imageView)
    }
}