package com.example.coroutinebible.chapter2.code2

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	println("[${Thread.currentThread().name}] 실행")
}