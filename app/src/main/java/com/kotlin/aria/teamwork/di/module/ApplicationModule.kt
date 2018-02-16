package com.kotlin.aria.teamwork.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by aria on 11/02/2018.
 */
@Module
class ApplicationModule(private val application: Application) {

    @Singleton
    @Provides
    fun provideApplication(): Application = application

}