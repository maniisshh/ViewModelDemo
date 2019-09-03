package com.manisks.viewmodeldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val myData = MainActivityViewModel()
        val myData: MainActivityViewModel =
            ViewModelProviders.of(this).get(MainActivityViewModel::class.java)


        val myRandomNumber = myData.getNumber()
        myRandomNumber?.observe(this, Observer { s: String? -> tvNumber.text = s })

        btnUpdate.setOnClickListener { myData.createNumber() }

        Timber.d("Random Number Set")
    }
}
