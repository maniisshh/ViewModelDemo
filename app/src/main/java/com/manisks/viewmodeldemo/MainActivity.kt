package com.manisks.viewmodeldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val myData = MainActivityViewModel()
        val myData = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val myRandomNumber = myData.getNumber()
        tvNumber.text = myRandomNumber

        Timber.d("Random Number Set")
    }
}
