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

import android.app.Application
import stiletto.Component
import kotlin.properties.Delegates

public class StilettoApp : Application() {

  val component: ApplicationComponent = ApplicationComponent(this)

  override fun onCreate() {
    super.onCreate()

  }
}