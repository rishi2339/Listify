package com.cmp.todo

import com.cmp.todo.presentation.settings.Setting
import com.russhwolf.settings.Settings
import org.koin.core.module.Module
import org.koin.dsl.module


actual fun platformModule(): Module = module {
    //single { DriverFactory(get()) }
    single<Settings> { Setting(get()).createSettings() }
}
