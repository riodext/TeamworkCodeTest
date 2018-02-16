package com.kotlin.aria.teamwork.presentation.main

import com.kotlin.aria.teamwork.domain.main.entity.Project

/**
 * Created by aria on 28/12/2017.
 */
interface ProjectClickListener {

    fun onItemClick(item: Project)
}