package com.kotlin.aria.teamwork.di.module

import android.support.v7.app.AppCompatActivity
import com.kotlin.aria.teamwork.di.scope.PerActivity
import com.kotlin.aria.teamwork.presentation.base.GlideImageLoader
import com.kotlin.aria.teamwork.presentation.base.ImageLoaderContract
import dagger.Module
import dagger.Provides

/**
 * Created by aria on 11/02/2018.
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @PerActivity
    @Provides
    fun providesActivity(): AppCompatActivity = activity

    @PerActivity
    @Provides
    fun providesImageLoader(): ImageLoaderContract = GlideImageLoader() // could be Picasso or other

}