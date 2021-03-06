package com.github.ryukato.link.developers.helper

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking

fun testRunBlocking(testBlock: suspend CoroutineScope.() -> Unit) {
    runBlocking { testBlock() }
}
