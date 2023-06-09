package com.example.mvvmaechiticura

import android.app.Application
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module


class MyApplication: Application() {


    override fun onCreate() {
        super.onCreate()
     val appModule = module{

         single <ClassA>{
             ClassA(get(),get(),get())
         }

         single <Classb>{
             Classb(get(),99)
         }
         single <ClassC>{
             ClassC(99,"")
         }
         viewModel<MyViewmodel> {
             MyViewmodel()
         }
     }
        startKoin {
            attachBaseContext(applicationContext)
            modules(appModule)
        }

    }
}