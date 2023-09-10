package com.webchat.ui

import cafe.adriel.voyager.core.model.StateScreenModel
import com.jetbrains.handson.kmm.shared.WebChatSDK
import com.jetbrains.handson.kmm.shared.entity.RocketLaunch
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LaunchScreenModel(private val sdk: WebChatSDK) : StateScreenModel<List<RocketLaunch>>(emptyList()) {

    fun getLaunches() {
        coroutineScope.launch {
            delay(2000L)
            mutableState.value = sdk.getLaunches(true)
        }
    }

}