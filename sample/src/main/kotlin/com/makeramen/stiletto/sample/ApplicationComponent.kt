package com.makeramen.stiletto.sample

import com.makeramen.stiletto.sample.data.DataModule
import stiletto.Component

class ApplicationComponent(override val stilettoApp: StilettoApp) : Component(),
    ApplicationModule, DataModule {
}