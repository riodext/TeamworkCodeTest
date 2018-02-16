package com.kotlin.aria.teamwork.presentation.base

import android.content.Context
import android.widget.ImageView

/**
 * Created by aria on 07/12/2017.
 */
interface ImageLoaderContract {

    fun load(context: Context, url: String, imageView: ImageView)
}