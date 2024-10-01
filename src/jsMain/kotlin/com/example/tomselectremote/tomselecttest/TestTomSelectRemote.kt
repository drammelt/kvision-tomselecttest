package com.example.tomselectremote.tomselecttest

import com.example.tomselectremote.tomselecttest.frontendService.IFrontEndService
import io.kvision.form.formPanel
import io.kvision.form.select.TomSelectOptions
import io.kvision.form.select.TomSelectRemote
import io.kvision.form.select.tomSelectRemote
import io.kvision.html.div
import io.kvision.panel.SimplePanel
import io.kvision.panel.fieldsetPanel
import io.kvision.remote.getServiceManager
import io.kvision.utils.px

class TestTomSelectRemote: SimplePanel() {
    init {
        div {
            margin = 10.px
            width = 400.px
            tomSelectRemote(
                label = "Test Works",
                serviceManager = getServiceManager(),
                function = IFrontEndService::filterData,
            ) {
                this.input.tsOptions = TomSelectOptions(
                    preloadOnFocus = true,
                    preload = true,
                    openOnFocus = true,
                )
                placeholder = "Begin typing stuff"
            }
        }
        div {
            margin = 10.px
            width = 400.px

            tomSelectRemote(
                label = "Test Fails",
                serviceManager = getServiceManager(),
                function = IFrontEndService::filterData,
                tsOptions = TomSelectOptions(
                    preloadOnFocus = true,
                    preload = true,
                    openOnFocus = true,
                )
            ) {
                placeholder = "Begin typing stuff"
            }
        }
    }
}