package com.smu.hellokotlin.view

import android.support.v7.widget.RecyclerView
import com.smu.hellokotlin.MainActivity
import com.smu.hellokotlin.R
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by sapuser on 10/16/2018.
 */
class MainActivityUI: AnkoComponent<MainActivity> {
    lateinit var club_list: RecyclerView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout{
            backgroundColor = resources.getColor(R.color.colorWhite)
            club_list = recyclerView{
                lparams(width = matchParent, height = matchParent)

            }

        }
    }
}