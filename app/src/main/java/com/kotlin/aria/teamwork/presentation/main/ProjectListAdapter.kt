package com.kotlin.aria.teamwork.ui.screens.newslist.adapter

import android.view.View
import com.kotlin.aria.teamwork.R
import com.kotlin.aria.teamwork.base.all.BaseRecyclerViewAdapter
import com.kotlin.aria.teamwork.domain.main.entity.Project
import com.kotlin.aria.teamwork.presentation.base.ImageLoaderContract
import com.kotlin.aria.teamwork.presentation.main.ProjectClickListener
import kotlinx.android.synthetic.main.projectlist_item.view.*

/**
 * Created by aria on 28/12/2017.
 */
class ProjectListAdapter constructor(
        list: List<Project>,
        private val imageLoader: ImageLoaderContract,
        private val newsClickListener: ProjectClickListener)
    : BaseRecyclerViewAdapter<Project>(list, R.layout.projectlist_item) {

    override fun onItemClick(itemView: View, position: Int) {
        newsClickListener.onItemClick(itemList[position])
    }

    override fun View.bind(item: Project) {
        tv_item_title.text = item.name
    }

}