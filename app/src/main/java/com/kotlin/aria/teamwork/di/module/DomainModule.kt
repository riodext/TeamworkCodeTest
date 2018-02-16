package com.kotlin.aria.teamwork.di.module

import com.kotlin.aria.teamwork.domain.main.interactor.ProjectListInteractor
import com.kotlin.aria.teamwork.domain.main.repository.ProjectListRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by aria on 11/02/2018.
 */
@Module
class DomainModule {

    @Singleton
    @Provides
    fun provideProjectListInteractor(repository: ProjectListRepository): ProjectListInteractor {
        return ProjectListInteractor(repository)
    }
}
