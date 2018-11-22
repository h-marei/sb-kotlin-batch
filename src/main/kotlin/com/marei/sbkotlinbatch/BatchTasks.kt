package com.marei.sbkotlinbatch

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class BatchTasks {

    // initialDelay：バッチ起動開始後何秒後に実行するか（ミリ秒指定）
    // fixedDelay：何秒ごとに処理を実行するか（ミリ秒指定）
    @Scheduled(initialDelay = 5000, fixedDelay = 10000)
    fun helloWorld() {
        println("はろー、わーるど！")
    }
}