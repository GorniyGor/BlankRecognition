package ru.anvics.baseproject.presentation.views.ui.fragments

import android.support.v4.app.Fragment
import ru.anvics.baseproject.presentation.views.iviews.BaseView
import ru.anvics.templates.util.ProgressDialog

abstract class BaseFragment: Fragment(), BaseView {
    private val progress by lazy {
        if(activity != null)
            ProgressDialog(activity!!)
        else null
    }

    override fun showProgress() {
        progress?.show()
    }
    override fun hideProgress() {
        progress?.dismiss()
    }
}