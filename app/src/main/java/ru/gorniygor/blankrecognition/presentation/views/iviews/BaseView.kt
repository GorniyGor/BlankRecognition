package ru.gorniygor.blankrecognition.presentation.views.iviews

import com.arellomobile.mvp.MvpView

interface BaseView: MvpView{
    fun error(message: String?)
    fun showProgress()
    fun hideProgress()
}