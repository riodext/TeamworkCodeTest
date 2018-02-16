package com.kotlin.aria.teamwork.base.all

import android.os.Bundle
import android.support.annotation.CallSuper
import android.view.MenuItem
import com.kotlin.aria.teamwork.App
import com.kotlin.aria.teamwork.base.basemvp.BaseMVPActivity
import com.kotlin.aria.teamwork.di.component.ActivityComponent
import com.kotlin.aria.teamwork.di.module.ActivityModule
import com.kotlin.aria.teamwork.unSafeLazy

/**
 * Created by aria on 11/02/2018.
 */
abstract class BaseActivity<V: BaseContract.View, P: BaseContract.Presenter<V>>
    : BaseMVPActivity<V, P>() {

    val activityComponent: ActivityComponent by unSafeLazy {
        getAppComponent() + ActivityModule(this)
    }

    private fun getAppComponent() = App.instance.applicationComponent

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies()
        super.onCreate(savedInstanceState)
    }

    protected abstract fun injectDependencies()


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}