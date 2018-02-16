package com.kotlin.aria.teamwork.base.basemvp;

import android.arch.lifecycle.ViewModel;

/**
 * Created by aria on 11/02/2018.
 */

public final class BaseViewModel<V extends BaseMVPContract.View, P extends BaseMVPContract.Presenter<V>>
        extends ViewModel {

    private P presenter;

    void setPresenter(P presenter) {
        if (this.presenter == null) {
            this.presenter = presenter;
        }
    }

    P getPresenter() {
        return this.presenter;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        presenter.onPresenterDestroy();
        presenter = null;
    }
}
