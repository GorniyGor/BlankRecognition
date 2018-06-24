package ru.anvics.baseproject.presentation.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.anvics.baseproject.presentation.views.iviews.ExampleView

@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>() {

    fun getEntityById(id: Long) {
    }

}