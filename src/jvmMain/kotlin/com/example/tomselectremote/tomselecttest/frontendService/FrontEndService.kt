package com.example.tomselectremote.tomselecttest.frontendService

import io.kvision.remote.RemoteOption

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual class FrontEndService : IFrontEndService {
    override suspend fun filterData(search: String?, initial: String?, state: String?): List<RemoteOption> {
        return listOf(
            RemoteOption(value = "1", text = "Option1: $search"),
            RemoteOption(value = "2", text = "Option2: $initial"),
            RemoteOption(value = "3", text = "Option3: $state"),
        )
    }
}