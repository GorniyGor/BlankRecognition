package ru.anvics.baseproject.data

import io.reactivex.Single
import ru.anvics.baseproject.domain.ExampleEntity
import ru.anvics.baseproject.domain.repository.IExampleRepository

object ExampleRepository : IExampleRepository {
    override fun getEntityById(id: Long): Single<ExampleEntity> {
        return Single.just(ExampleEntity(id, "Title"))
    }
}