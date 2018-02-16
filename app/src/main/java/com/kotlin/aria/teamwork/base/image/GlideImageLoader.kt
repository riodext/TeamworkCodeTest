package com.kotlin.aria.teamwork.presentation.base

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

/**
 * Created by aria on 07/12/2017.
 */
class GlideImageLoader: ImageLoaderContract {

    override fun load(context: Context, url: String, imageView: ImageView) {
        Glide.with(context)
                .load(url)
                .transition(DrawableTransitionOptions.withCrossFade(200))
                .into(imageView)
    }
}