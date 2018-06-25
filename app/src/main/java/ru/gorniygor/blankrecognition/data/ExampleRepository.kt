package ru.gorniygor.blankrecognition.data

import io.reactivex.Single
import ru.gorniygor.blankrecognition.domain.ExampleEntity
import ru.gorniygor.blankrecognition.domain.repository.IExampleRepository

object ExampleRepository : IExampleRepository {
    override fun getEntityById(id: Long): Single<ExampleEntity> {
        return Single.just(ExampleEntity(id, "Title"))
    }
}