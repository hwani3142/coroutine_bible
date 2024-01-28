package com.example.coroutinebible.chapter3.code1

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.newSingleThreadContext

val dispatcher: CoroutineDispatcher = newSingleThreadContext(name = "SingleThread")

val multiThreadDispatcher: CoroutineDispatcher = newFixedThreadPoolContext(nThreads = 2, name = "MultiThread")