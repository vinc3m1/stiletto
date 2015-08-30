package com.makeramen.stiletto.sample

import android.app.Application
import kotlin.properties.Delegates

public class StilettoApp : Application() {

  val component = ApplicationComponent(this)

  override fun onCreate() {
    super.onCreate()

  }
}