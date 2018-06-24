package ru.anvics.baseproject.presentation.views.ui.activities

import com.arellomobile.mvp.MvpAppCompatActivity
import ru.anvics.baseproject.presentation.views.iviews.BaseView
import ru.anvics.baseproject.util.showToast
import ru.anvics.templates.util.ProgressDialog

abstract class BaseActivity : MvpAppCompatActivity(), BaseView {

    private val progress by lazy {
        ProgressDialog(this)
    }

    override fun showProgress() {
        progress.show()
    }
    override fun hideProgress() {
        progress.dismiss()
    }
    override fun error(message: String) {
        showToast(message)
    }

}