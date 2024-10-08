package com.example.tomselectremote.tomselecttest

import io.kvision.Application
import io.kvision.CoreModule
import io.kvision.BootstrapModule
import io.kvision.BootstrapCssModule
import io.kvision.TomSelectModule
import io.kvision.html.Span
import io.kvision.module
import io.kvision.panel.root
import io.kvision.startApplication
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

val AppScope = CoroutineScope(Dispatchers.Default + SupervisorJob())

class App : Application() {

    override fun start(state: Map<String, Any>) {
        val root = root("kvapp") {
        }
        AppScope.launch {
            root.add(TestTomSelectRemote())
        }
    }
}

fun main() {
    startApplication(
        ::App,
        module.hot,
        BootstrapModule,
        BootstrapCssModule,
        TomSelectModule,
        CoreModule
    )
}
