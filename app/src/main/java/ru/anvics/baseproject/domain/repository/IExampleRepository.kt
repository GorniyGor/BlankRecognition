package ru.anvics.baseproject.domain.repository

import io.reactivex.Single
import ru.anvics.baseproject.domain.ExampleEntity

interface IExampleRepository {
    fun getEntityById(id: Long): Single<ExampleEntity>
}