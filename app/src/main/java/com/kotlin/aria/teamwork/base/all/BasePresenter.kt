package com.kotlin.aria.teamwork.base.all

import com.kotlin.aria.teamwork.base.basemvp.BaseMVPPresenter


/**
 * Created by aria on 11/02/2018.
 */
abstract class BasePresenter<V : BaseContract.View> : BaseMVPPresenter<V>(), BaseContract.Presenter<V>