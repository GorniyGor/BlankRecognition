package ru.gorniygor.blankrecognition.presentation.views.ui.activities

import com.arellomobile.mvp.MvpAppCompatActivity
import ru.gorniygor.blankrecognition.presentation.views.iviews.BaseView
import ru.gorniygor.blankrecognition.util.showToast
import ru.gorniygor.templates.util.ProgressDialog

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
    override fun error(message: String?) {
        if (message != null) showToast(message)
        else showToast("Неопознанная ошибка")
    }

}