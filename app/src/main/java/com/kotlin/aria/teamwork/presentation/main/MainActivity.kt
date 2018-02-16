package com.kotlin.aria.teamwork.ui.screens.main.activity

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.kotlin.aria.teamwork.R
import com.kotlin.aria.teamwork.base.all.BaseActivity
import com.kotlin.aria.teamwork.domain.main.entity.Project
import com.kotlin.aria.teamwork.presentation.base.ImageLoaderContract
import com.kotlin.aria.teamwork.presentation.main.MainPresenter
import com.kotlin.aria.teamwork.presentation.main.ProjectClickListener
import com.kotlin.aria.teamwork.ui.screens.main.contract.MainActivityContract
import com.kotlin.aria.teamwork.ui.screens.newslist.adapter.ProjectListAdapter
import com.kotlin.aria.teamwork.util.gone
import com.kotlin.aria.teamwork.util.sethasFixedSizeToFalse
import com.kotlin.aria.teamwork.util.visible
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity: BaseActivity<MainActivityContract.View, MainActivityContract.Presenter>(),
                     MainActivityContract.View, ProjectClickListener {

    @Inject lateinit var mainPresenter: MainPresenter

    @Inject lateinit var imageLoader: ImageLoaderContract

    private var listAdapter: ProjectListAdapter? = null

    override fun initPresenter() = mainPresenter

    override fun injectDependencies() = activityComponent.inject(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(main_toolbar)
        mainPresenter.getProjects()
    }

    override fun showLoading() {
        progress_bar?.visible()
    }

    override fun hideLoading() {
        progress_bar?.gone()
    }

    private infix fun setupRecyclerView(list: List<Project>) {
        listAdapter = ProjectListAdapter(list, imageLoader, this)
        rv_news_list.layoutManager = GridLayoutManager(this, 1)
        rv_news_list.sethasFixedSizeToFalse()
        rv_news_list.adapter = listAdapter
        rv_news_list.scheduleLayoutAnimation()
    }

    override fun showProjects(list: List<Project>) {
        rv_news_list.visible()
        listAdapter?.update(list) ?: this setupRecyclerView list
    }

    override fun showNoItemsUI() {
        rv_news_list.gone()
        tv_no_items.visible()
    }

    override fun hideNoItemsUI() {
        tv_no_items.gone()
    }

    override fun showError() {
        Toast.makeText(this, getString(R.string.error_projects_list), Toast.LENGTH_SHORT).show()
    }

    override fun onItemClick(item: Project) {
        // TODO startDetailActivityWithBundle
    }

}
