package com.example.dongle.nycsubway.presenter

import android.support.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.net.SocketTimeoutException

/**
 * @author Leopold
 */
@Suppress("unused")
abstract class BasePresenter<T> {
    private var disposables: CompositeDisposable? = CompositeDisposable()
    abstract var view: T?

    @CallSuper
    open fun onCreate() {}

    @CallSuper
    open fun onResume() {}

    @CallSuper
    open fun onPause() {}

    @CallSuper
    open fun onStop() {}

    @CallSuper
    fun onDestroy() {
        disposables?.clear()
        disposables = null
        view = null
    }

    protected fun isTimeoutError(throwable: Throwable): Boolean {
        return throwable is SocketTimeoutException
    }

    protected fun addToDisposable(disposable: Disposable) {
        disposables?.add(disposable)
    }
}