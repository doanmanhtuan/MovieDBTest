package com.example.myapplication.screen.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Movie
import com.example.myapplication.model.ResponseMovie
import kotlinx.android.synthetic.main.item_list_popular.view.*

class ListPopularAdapter {


    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var mTitle: TextView? = null
        private var mImage: ImageView? = null

        init {
            mTitle = itemView.findViewById(R.id.tvTitle)
            mImage = itemView.findViewById(R.id.image)
        }

        fun bind(moview: Movie) {
            mTitle?.text = moview.title
        }
    }
}