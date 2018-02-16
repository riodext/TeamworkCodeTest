package com.kotlin.aria.teamwork.di.component

import com.kotlin.aria.teamwork.di.module.ActivityModule
import com.kotlin.aria.teamwork.di.scope.PerActivity
import com.kotlin.aria.teamwork.ui.screens.main.activity.MainActivity
import dagger.Subcomponent

/**
 * Created by aria on 11/02/2018.
 */
@PerActivity
@Subcomponent(modules = [(ActivityModule::class)])

interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}