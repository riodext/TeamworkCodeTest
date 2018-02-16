package com.kotlin.aria.teamwork.base.basemvp;


import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;

/**
 * Created by aria on 11/02/2018.
 */

public interface BaseMVPContract {

    interface View {

    }

    interface Presenter<V extends View> {

        Bundle getStateBundle();

        void attachLifecycle(Lifecycle lifecycle);

        void detachLifecycle(Lifecycle lifecycle);

        void attachView(V view);

        void detachView();

        V getView();

        boolean isViewAttached();

        void onPresenterCreate();

        void onPresenterDestroy();
    }
}
