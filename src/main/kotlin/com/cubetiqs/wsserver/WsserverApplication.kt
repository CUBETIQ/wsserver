package com.cubetiqs.wsserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WsserverApplication

fun main(args: Array<String>) {
	runApplication<WsserverApplication>(*args)
}
