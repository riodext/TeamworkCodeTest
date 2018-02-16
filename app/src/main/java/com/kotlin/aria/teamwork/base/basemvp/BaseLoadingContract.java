package com.kotlin.aria.teamwork.base.basemvp;

/**
 * Created by aria on 11/02/2018.
 */

public interface BaseLoadingContract {

    interface View extends BaseMVPContract.View {

        void showLoading();

        void hideLoading();

        void showError(String errorMessage);
    }

    interface Presenter extends BaseMVPContract.Presenter<View> {

    }

}
