package com.manisks.viewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber
import java.util.*

/**
 * Created by user on 03-09-2019.
 */
class MainActivityViewModel : ViewModel() {

    private var myRandomNumber: MutableLiveData<String>? = null

    fun getNumber(): MutableLiveData<String>? {
        Timber.d("Get number")
        if (myRandomNumber == null) {
            myRandomNumber = MutableLiveData()
            createNumber()
        }
        return myRandomNumber
    }

    public fun createNumber() {
        Timber.d("Create new number")
        val random = Random()
        myRandomNumber!!.value = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    override fun onCleared() {
        super.onCleared()
        Timber.d("ViewModel Destroyed")
    }
}