package com.smu.hellokotlin.view

import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import com.smu.hellokotlin.DetailActivity
import com.smu.hellokotlin.R
import org.jetbrains.anko.*

/**
 * Created by sapuser on 10/16/2018.
 */
class DetailActivityUI : AnkoComponent<DetailActivity> {
    lateinit var ivLogo : ImageView
    lateinit var tvNama : TextView
    lateinit var tvDesc : TextView

    override fun createView(ui: AnkoContext<DetailActivity>) = with(ui){
        verticalLayout {
            lparams(width = matchParent, height = matchParent)
            verticalPadding = resources.getDimensionPixelSize(R.dimen._10sdp)
            horizontalPadding = resources.getDimensionPixelSize(R.dimen._20sdp)
            gravity = Gravity.CENTER_HORIZONTAL

            backgroundColor = resources.getColor(R.color.colorWhite)

            ivLogo = imageView {
                setImageDrawable(resources.getDrawable(R.drawable.img_chelsea))
            }.lparams(width =  resources.getDimensionPixelSize(R.dimen._80sdp), height = resources.getDimensionPixelSize(R.dimen._80sdp))

            tvNama = textView {
                textSize = resources.getDimension(R.dimen._14sdp)
                textColor = resources.getColor(R.color.colorBlack)
                gravity = Gravity.CENTER_HORIZONTAL
                text = "Example Text"

            }.lparams(width =  matchParent, height = wrapContent){
                topMargin = resources.getDimensionPixelSize(R.dimen._3sdp)
                bottomMargin = resources.getDimensionPixelSize(R.dimen._5sdp)
            }

            scrollView {
                tvDesc = textView {
                    textSize = resources.getDimension(R.dimen._12sdp)
                    text = "Example Desc"
                }.lparams(width =  matchParent, height = wrapContent)
            }.lparams(width = matchParent, height = matchParent)


        }
    }
}