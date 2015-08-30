package com.makeramen.stiletto.sample.data

import android.app.Application
import android.content.Context
import stiletto.Module

public interface DataModule : Module {

  // dependencies are declared as abstract functions
  // make sure to have same method signature as providing module
  fun application() : Application

  fun sharedPreferences() { application().getSharedPreferences("default", Context.MODE_PRIVATE) }
}