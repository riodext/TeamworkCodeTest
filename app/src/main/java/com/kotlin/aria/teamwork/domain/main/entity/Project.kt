package com.kotlin.aria.teamwork.domain.main.entity

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by aria on 16/02/2018.
 */
@SuppressLint("ParcelCreator")
@Parcelize
data class Project(
        val name: String? = null) : Parcelable