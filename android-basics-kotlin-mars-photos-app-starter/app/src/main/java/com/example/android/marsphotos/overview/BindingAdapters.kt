package com.example.android.marsphotos.overview

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load
import com.example.android.marsphotos.R

@BindingAdapter("imageUrl")
fun bindImage(imgView : ImageView, imgUrl : String?){
    imgUrl?.let {
        val imgUrl = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUrl){
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }
    }

}