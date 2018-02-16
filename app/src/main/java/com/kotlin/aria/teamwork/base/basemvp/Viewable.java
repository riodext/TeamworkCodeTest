package com.kotlin.aria.teamwork.base.basemvp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by aria on 11/02/2018.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Viewable {

    int LAYOUT_NOT_DEFINED = -1;

    Class<? extends BaseMVPPresenter> presenter();

    int layout() default LAYOUT_NOT_DEFINED;
}
