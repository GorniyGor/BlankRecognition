package ru.gorniygor.blankrecognition.presentation.views.iviews

import ru.gorniygor.blankrecognition.domain.ExampleEntity

interface ExampleView : BaseView {
    fun setEntity(entity: ExampleEntity)
}