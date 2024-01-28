package com.example.coroutinebible.chapter3.code3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher: CoroutineDispatcher = newSingleThreadContext(name = "SingleThread")
    launch(dispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}
