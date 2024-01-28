package com.example.coroutinebible

// @SpringBootApplication
// class CoroutineBibleApplication
//
// fun main(args: Array<String>) {
//    runApplication<CoroutineBibleApplication>(*args)
// }
class ExampleThread : Thread() {
    override fun run() {
        println("[${Thread.currentThread().name}] 새로운 스레드 시작")
        Thread.sleep(2000L) // 2초 동안 대기
        println("[${Thread.currentThread().name}] 새로운 스레드 종료")
    }
}

fun main() {
    println("[${Thread.currentThread().name}] 메인 스레드 시작")
    ExampleThread().start()
    Thread.sleep(1000L) // 1초 동안 대기
    println("[${Thread.currentThread().name}] 메인 스레드 종료")
}
