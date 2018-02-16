package com.kotlin.aria.teamwork.base.all

import android.support.v7.app.AppCompatActivity
import com.kotlin.aria.teamwork.App
import com.kotlin.aria.teamwork.di.component.ActivityComponent
import com.kotlin.aria.teamwork.di.module.ActivityModule
import com.kotlin.aria.teamwork.unSafeLazy

/**
 * Created by aria on 11/02/2018.
 */
class
ComponentHelper constructor(private val activity: AppCompatActivity) {

    fun getCompo(): ActivityComponent {
        return activityComponent
    }

    val activityComponent: ActivityComponent by unSafeLazy {
        getAppComponent() + ActivityModule(activity)
    }

    private fun getAppComponent() = App.instance.applicationComponent

}