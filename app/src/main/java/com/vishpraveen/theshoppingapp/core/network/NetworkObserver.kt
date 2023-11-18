package com.vishpraveen.theshoppingapp.core.network

import kotlinx.coroutines.flow.Flow

interface NetworkObserver {
    fun connectionStatus(): Flow<Boolean>
}
