package ru.anvics.baseproject.presentation.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.anvics.baseproject.data.ExampleRepository
import ru.anvics.baseproject.domain.interactors.ExampleInteractor
import ru.anvics.baseproject.presentation.views.iviews.ExampleView

@InjectViewState
class ExamplePresenter : MvpPresenter<ExampleView>() {
    private val interactor = ExampleInteractor(ExampleRepository)

    fun getEntityById(id: Long) {
        interactor.getEntityById(id)
                .subscribe(
                        { viewState.setEntity(it) },
                        { viewState.error(it.message) }
                )
    }

}