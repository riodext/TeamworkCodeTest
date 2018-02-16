package com.kotlin.aria.teamwork.ui.screens.main.contract

import com.kotlin.aria.teamwork.base.all.BaseContract
import com.kotlin.aria.teamwork.domain.main.entity.Project

/**
 * Created by aria on 09/12/2017.
 */
interface MainActivityContract {

    interface View: BaseContract.View {

        fun showProjects(list: List<Project>)

        fun showLoading()

        fun hideLoading()

        fun showError()

        fun showNoItemsUI()

        fun hideNoItemsUI()
    }

    interface Presenter: BaseContract.Presenter<View> {

        fun getProjects()
    }
}