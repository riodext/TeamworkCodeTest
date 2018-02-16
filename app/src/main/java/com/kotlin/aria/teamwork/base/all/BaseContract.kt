package com.kotlin.aria.teamwork.base.all

import com.kotlin.aria.teamwork.base.basemvp.BaseMVPContract

/**
 * Created by aria on 11/02/2018.
 */
interface BaseContract {

    interface View: BaseMVPContract.View

    interface Presenter<V: BaseMVPContract.View> : BaseMVPContract.Presenter<V>
}