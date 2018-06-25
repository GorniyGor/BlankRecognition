package ru.gorniygor.blankrecognition.presentation.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.gorniygor.blankrecognition.data.ExampleRepository
import ru.gorniygor.blankrecognition.domain.interactors.ExampleInteractor
import ru.gorniygor.blankrecognition.presentation.views.iviews.ExampleView

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