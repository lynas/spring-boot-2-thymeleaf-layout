package com.lynas.invmboot

import nz.net.ultraq.thymeleaf.LayoutDialect
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class InvmBootApplication {
    @Bean
    fun layoutDialect(): LayoutDialect {
        return LayoutDialect()
    }
}

fun main(args: Array<String>) {
    runApplication<InvmBootApplication>(*args)
}
