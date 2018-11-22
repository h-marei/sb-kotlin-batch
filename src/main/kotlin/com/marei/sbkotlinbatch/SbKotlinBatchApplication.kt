package com.marei.sbkotlinbatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SbKotlinBatchApplication

fun main(args: Array<String>) {
    runApplication<SbKotlinBatchApplication>(*args)
}
