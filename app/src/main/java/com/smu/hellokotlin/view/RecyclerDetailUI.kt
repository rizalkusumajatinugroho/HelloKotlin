package com.smu.hellokotlin.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.smu.hellokotlin.MainActivity
import com.smu.hellokotlin.R
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by sapuser on 10/16/2018.
 */
class RecyclerDetailUI : AnkoComponent<ViewGroup>{
    lateinit var name : TextView
    lateinit var image : ImageView

    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui) {
            linearLayout {
                lparams(width = matchParent, height = wrapContent)
                orientation = LinearLayout.HORIZONTAL
                padding = resources.getDimensionPixelSize(R.dimen._10sdp)

                image = imageView {
                    id = R.id.ivLogo
                }.lparams(width = resources.getDimensionPixelSize(R.dimen._50sdp), height = resources.getDimensionPixelSize(R.dimen._50sdp))

                name = textView {
                    id = R.id.tvNama
                }.lparams(width = wrapContent, height = wrapContent){
                    margin = resources.getDimensionPixelSize(R.dimen._10sdp)
                }
            }
        }
    }
}