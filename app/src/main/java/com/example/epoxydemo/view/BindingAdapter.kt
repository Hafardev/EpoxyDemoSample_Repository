package com.example.epoxydemo.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bindImageURL")
fun ImageView.setImageURL(imageURL:String?){
    if(imageURL != null) {
        Glide.with(this).asBitmap().load(imageURL).into(this)
    }
}