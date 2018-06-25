package ru.gorniygor.blankrecognition.domain.interactors

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.gorniygor.blankrecognition.domain.ExampleEntity
import ru.gorniygor.blankrecognition.domain.repository.IExampleRepository

/**
 * Created by Gor on 24.06.2018.
 */
class ExampleInteractor(private val repository: IExampleRepository) {

    fun getEntityById(id: Long): Single<ExampleEntity>{
        return repository.getEntityById(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}