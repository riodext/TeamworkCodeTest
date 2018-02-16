package com.kotlin.aria.teamwork.data.typelist.network

import com.kotlin.aria.teamwork.data.main.ProjectItem
import com.kotlin.aria.teamwork.data.main.ProjectsResponse
import com.kotlin.aria.teamwork.domain.main.entity.Project

/**
 * Created by aria on 11/02/2018.
 */
class ProjectListResponseMapper {

    //think doing this mapper in Java ;)
    fun translate(list: ProjectsResponse): List<Project> {
        return list.projects.asSequence()
                .map { translate(it) }
                .toList()
    }

    private fun translate(response: ProjectItem): Project {
        return Project(name = response.name)
    }
}