package com.kotlin.aria.teamwork

import android.app.Application
import com.kotlin.aria.teamwork.di.component.ApplicationComponent
import com.kotlin.aria.teamwork.di.component.DaggerApplicationComponent
import com.kotlin.aria.teamwork.di.module.ApplicationModule
import com.kotlin.aria.teamwork.util.unSafeLazy


/**
 * Created by aria on 11/02/2018.
 */
class App: Application() {

    val applicationComponent: ApplicationComponent by unSafeLazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }


}