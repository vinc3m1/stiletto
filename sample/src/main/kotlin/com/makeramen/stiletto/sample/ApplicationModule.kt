package com.makeramen.stiletto.sample

import android.app.Application
import android.content.Context
import android.view.inputmethod.InputMethodManager
import stiletto.Module

public interface ApplicationModule : Module {

  // module's constructor dependencies are values
  val stilettoApp : StilettoApp

  // provide functions are stateless
  fun stilettoApp() = stilettoApp

  fun application() = stilettoApp()

  fun inputMethodManager() = singleton {
    application().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
  }
}