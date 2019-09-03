package com.manisks.viewmodeldemo

import androidx.lifecycle.ViewModel
import timber.log.Timber
import java.util.*

/**
 * Created by user on 03-09-2019.
 */
class MainActivityViewModel : ViewModel() {

    private var myRandomNumber: String? = null

    fun getNumber(): String? {
        Timber.d("Get number")
        if (myRandomNumber == null) {
            createNumber()
        }
        return myRandomNumber
    }

    private fun createNumber() {
        Timber.d("Create new number")
        val random = Random()
        myRandomNumber = "Number: " + (random.nextInt(10 - 1) + 1)
    }

     override fun onCleared() {
         super.onCleared()
         Timber.d("ViewModel Destroyed")
     }
}