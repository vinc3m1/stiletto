package com.makeramen.stiletto.sample.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.makeramen.stiletto.sample.StilettoApp
import kotlin.properties.Delegates

public class MainActivity : AppCompatActivity() {

  val component by Delegates.lazy { (getApplicationContext() as StilettoApp).component }
  val sharedPrefs by Delegates.lazy { component.sharedPreferences() }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
}