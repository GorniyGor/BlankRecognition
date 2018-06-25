package ru.gorniygor.blankrecognition.presentation.views.ui.fragments

import android.support.v4.app.Fragment
import ru.gorniygor.blankrecognition.presentation.views.iviews.BaseView
import ru.gorniygor.templates.util.ProgressDialog

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