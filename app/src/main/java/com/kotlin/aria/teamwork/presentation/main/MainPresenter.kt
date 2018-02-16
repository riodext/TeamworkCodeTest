package com.kotlin.aria.teamwork.presentation.main

import com.kotlin.aria.teamwork.base.all.BasePresenter
import com.kotlin.aria.teamwork.domain.main.entity.Project
import com.kotlin.aria.teamwork.domain.main.interactor.ProjectListInteractor
import com.kotlin.aria.teamwork.ui.screens.main.contract.MainActivityContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by aria on 11/02/2018.
 */
class MainPresenter @Inject constructor(
        private val disposable: CompositeDisposable,
        private val interactor: ProjectListInteractor)
    : BasePresenter<MainActivityContract.View>(), MainActivityContract.Presenter {

    override fun getProjects() {
        disposable.add(interactor.getProjects()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onSuccess()))
    }

    private fun onSuccess() = {
        it: List<Project> ->
            view?.showProjects(it) ?: Unit
    }
}