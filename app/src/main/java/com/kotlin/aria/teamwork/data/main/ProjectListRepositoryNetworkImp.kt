package com.kotlin.aria.teamwork.data.typelist.repositoryimp.network
import com.kotlin.aria.teamwork.data.typelist.network.ProjectListResponseMapper
import com.kotlin.aria.teamwork.data.typelist.repositoryimp.network.service.ProjectListService
import com.kotlin.aria.teamwork.domain.main.entity.Project
import com.kotlin.aria.teamwork.domain.main.repository.ProjectListRepository
import io.reactivex.Flowable

/**
 * Created by aria on 11/02/2018.
 */
class ProjectListRepositoryNetworkImp constructor(
        private val service: ProjectListService,
        private val listMapper: ProjectListResponseMapper): ProjectListRepository {

    override fun fetchProjects(): Flowable<List<Project>> {
        return service.fetchProjects().map {
            listMapper.translate(it)
        }
    }

}