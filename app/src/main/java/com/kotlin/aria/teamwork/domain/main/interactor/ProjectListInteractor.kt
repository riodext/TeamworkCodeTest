package com.kotlin.aria.teamwork.domain.main.interactor

import com.kotlin.aria.teamwork.domain.main.entity.Project
import com.kotlin.aria.teamwork.domain.main.repository.ProjectListRepository
import io.reactivex.Flowable

/**
 * Created by aria on 11/02/2018.
 */
class ProjectListInteractor(private val repository: ProjectListRepository) {

    fun getProjects(): Flowable<List<Project>> {
        return repository.fetchProjects()
    }
}