package com.kotlin.aria.teamwork.data.typelist.repositoryimp.network.service

import com.kotlin.aria.teamwork.data.main.ProjectsResponse
import io.reactivex.Flowable
import retrofit2.http.GET

/**
 * Created by aria on 11/02/2018.
 */
interface ProjectListService {

    @GET("projects.json")
    fun fetchProjects(): Flowable<ProjectsResponse>
}