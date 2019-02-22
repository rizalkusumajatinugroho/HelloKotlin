package com.smu.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.smu.hellokotlin.model.Item
import com.smu.hellokotlin.view.MainActivityUI
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()
    lateinit var mainUI: MainActivityUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mainUI = MainActivityUI()
//        mainUI.setContentView(this)

        initData()

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = RecyclerViewAdapter(this, items){item,position ->
            startActivity<DetailActivity>("nama" to item.name, "logo" to position, "desc" to item.desc )
        }
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val desc = resources.getStringArray(R.array.club_desc)
        items.clear()


        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0), desc[i]))
        }

        //Recycle the typed array
        image.recycle()
    }


}
