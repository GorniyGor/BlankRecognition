package ru.gorniygor.blankrecognition.domain.repository

import io.reactivex.Single
import ru.gorniygor.blankrecognition.domain.ExampleEntity

interface IExampleRepository {
    fun getEntityById(id: Long): Single<ExampleEntity>
}