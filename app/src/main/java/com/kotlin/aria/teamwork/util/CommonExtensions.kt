package com.kotlin.aria.teamwork.util

import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import java.util.*

/**
 * Created by aria on 11/02/2018.
 */
fun <T> unSafeLazy(initializer: () -> T): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        initializer()
    }
}

fun EditText.isEmpty() = TextUtils.isEmpty(text)

fun TextView.showCurrentDate() {
    text = currentDate
}

infix fun ViewGroup.inflate(layoutResId: Int): View =
        LayoutInflater.from(context).inflate(layoutResId, this, false)

val currentDate = Calendar.getInstance().time.toString()

fun ClosedRange<Int>.random() =
        Random().nextInt(endInclusive - start) +  start

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun RecyclerView.sethasFixedSizeToFalse() =
        setHasFixedSize(false)