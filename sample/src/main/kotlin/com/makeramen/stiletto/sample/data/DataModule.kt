package com.makeramen.stiletto.sample.data

import android.app.Application
import android.content.Context
import stiletto.Module

public interface DataModule : Module {

  // dependencies are declared as abstract functions
  // make sure to have same method signature as providing module
  fun application() : Application

  fun sharedPreferences() = singleton {
    application().getSharedPreferences("default", Context.MODE_PRIVATE)
  }

  fun specialSharedPreferences() = singleton("special") {
    application().getSharedPreferences("special", Context.MODE_PRIVATE)
  }
}