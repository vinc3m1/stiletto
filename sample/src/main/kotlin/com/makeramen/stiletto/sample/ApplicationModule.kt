/*
* Copyright (C) 2015 Vincent Mi
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.makeramen.stiletto.sample

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