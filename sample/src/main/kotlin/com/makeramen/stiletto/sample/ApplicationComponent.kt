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

import com.makeramen.stiletto.sample.data.DataModule
import stiletto.Component

// abstract interface to allow other components to inherit from this one
interface AbsApplicationComponent : ApplicationModule, DataModule {
  override fun application(): StilettoApp {
    return super.application()
  }
}

class ApplicationComponent(override val stilettoApp: StilettoApp) : Component(), AbsApplicationComponent