package com.smu.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.smu.hellokotlin.view.DetailActivityUI
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

/**
 * Created by sapuser on 10/16/2018.
 */
class DetailActivity : AppCompatActivity(){
    lateinit var detailUI : DetailActivityUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailUI = DetailActivityUI()
        detailUI.setContentView(this)

        val logo = intent.getIntExtra("logo", 0)
        val namaFC = intent.getStringExtra("nama")
        val desc = intent.getStringExtra("desc")

        val imageArray = resources.obtainTypedArray(R.array.club_image)

        val image = imageArray.getResourceId(logo, 0)

        Log.d("debug_rizal", "image extra : " + logo)

        image?.let { Picasso.get().load(image).into(detailUI.ivLogo) }
        detailUI.tvNama.text = namaFC;
        detailUI.tvDesc.text = desc;

    }

}