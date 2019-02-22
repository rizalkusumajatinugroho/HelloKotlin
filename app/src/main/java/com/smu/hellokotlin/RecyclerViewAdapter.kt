package com.smu.hellokotlin

/**
 * Created by sapuser on 10/16/2018.
 */

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.smu.hellokotlin.model.Item
import com.smu.hellokotlin.view.RecyclerDetailUI
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

class RecyclerViewAdapter(private val context: Context, private val items: List<Item>, private val listener: (Item, Int) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(RecyclerDetailUI().createView(AnkoContext.create(parent.context, parent)))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener, position)

    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private var name = view.findViewById<TextView>(R.id.tvNama)
        private var image =  view.findViewById<ImageView>(R.id.ivLogo)


        fun bindItem(items: Item, listener: (singleItem : Item, itemPosition : Int) -> Unit, position : Int) {
            name.text = items.name
            items.image?.let { Picasso.get().load(it).into(image) }
            itemView.setOnClickListener { listener(items, position) }
        }
    }


}