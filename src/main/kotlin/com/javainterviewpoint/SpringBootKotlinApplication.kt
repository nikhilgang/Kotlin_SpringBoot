package com.javainterviewpoint

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootKotlinApplication

fun main(args: Array<String>)
{
    SpringApplication.run(SpringBootKotlinApplication::class.java, *args)
}