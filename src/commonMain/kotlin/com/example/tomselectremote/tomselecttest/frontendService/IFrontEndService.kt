package com.example.tomselectremote.tomselecttest.frontendService

import io.kvision.annotations.KVService
import io.kvision.remote.RemoteOption

@KVService
interface IFrontEndService {
    suspend fun filterData(search: String?, initial: String?, state: String?): List<RemoteOption>
}