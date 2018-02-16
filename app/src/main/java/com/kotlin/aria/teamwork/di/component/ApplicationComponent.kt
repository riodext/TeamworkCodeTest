package com.kotlin.aria.teamwork.di.component

import com.kotlin.aria.teamwork.di.module.ActivityModule
import com.kotlin.aria.teamwork.di.module.ApiModule
import com.kotlin.aria.teamwork.di.module.ApplicationModule
import com.kotlin.aria.teamwork.di.module.DomainModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by aria on 11/02/2018.
 */
@Singleton
@Component(modules = [
    ApplicationModule::class,
    ApiModule::class,
    DomainModule::class
])
interface ApplicationComponent {
       operator fun plus(activityModule: ActivityModule): ActivityComponent
}