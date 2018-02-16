package com.kotlin.aria.teamwork.di.module

import android.support.v7.app.AppCompatActivity
import com.kotlin.aria.teamwork.di.scope.PerActivity
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

}