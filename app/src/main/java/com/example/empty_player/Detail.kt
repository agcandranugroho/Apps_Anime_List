package com.example.empty_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Detail : AppCompatActivity() {
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PIC = "extra_pic"
        const val EXTRA_CIRI = "extra_ciri"
        const val EXTRA_UMUR = "extra_umur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvDetail : TextView = findViewById(R.id.tv_detail)
        val tvCiri : TextView = findViewById(R.id.tv_ciri)
        val tvUmur : TextView = findViewById(R.id.tv_umur)
        val imageAnime : ImageView = findViewById(R.id.image_anime)

        val name = intent.getStringExtra(EXTRA_NAME)
        val textName = "$name"
        tvName.text = textName

        //val picture = intent.getIntExtra(EXTRA_PIC,0)

        Glide.with(this)
            .load(intent.getIntExtra(Detail.EXTRA_PIC,0))
            //.apply(RequestOptions().override(500,1000))
            .into(imageAnime);

        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val textDetail = "$detail"
        tvDetail.text=textDetail

        val ciri = intent.getStringExtra(EXTRA_CIRI)
        val textCiri = "$ciri"
        tvCiri.text = textCiri

        val umur = intent.getStringExtra(EXTRA_UMUR)
        val textUmur = "$umur"
        tvUmur.text = textUmur

    }
}