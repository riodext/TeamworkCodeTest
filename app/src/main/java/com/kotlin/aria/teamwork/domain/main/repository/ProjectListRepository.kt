package com.kotlin.aria.teamwork.domain.main.repository

import com.kotlin.aria.teamwork.domain.main.entity.Project
import io.reactivex.Flowable

/**
 * Created by aria on 11/02/2018.
 */
interface ProjectListRepository {

    fun fetchProjects(): Flowable<List<Project>>
}