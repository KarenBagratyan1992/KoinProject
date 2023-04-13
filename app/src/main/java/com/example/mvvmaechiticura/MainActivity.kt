package com.example.mvvmaechiticura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject


class MainActivity : AppCompatActivity(), KoinComponent {
    val classA:ClassA by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  aclass:ClassA = get()

       //very bed practice
//        val classA = ClassA(Classb(ClassC(1,""),3),ClassC(1,""), this)

    }
}