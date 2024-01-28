package com.example.coroutinebible.chapter3.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val multiThreadDispatcher = newFixedThreadPoolContext(
        nThreads = 2,
        name = "MultiThread",
    )
    launch(multiThreadDispatcher) { // 부모 코루틴
        println("[${Thread.currentThread().name}] 부모 코루틴 실행")
        launch { // 자식 코루틴 실행
            println("[${Thread.currentThread().name}] 자식 코루틴 실행")
        }
        launch { // 자식 코루틴 실행
            println("[${Thread.currentThread().name}] 자식 코루틴 실행")
        }
    }
}
