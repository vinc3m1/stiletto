package com.makeramen.stiletto.sample

import android.app.Application
import stiletto.Module

public interface ApplicationModule : Module {

  // module's constructor dependencies are values
  val stilettoApp : StilettoApp

  // provide functions are stateless
  fun stilettoApp() { stilettoApp }

  fun application() { stilettoApp() }
}