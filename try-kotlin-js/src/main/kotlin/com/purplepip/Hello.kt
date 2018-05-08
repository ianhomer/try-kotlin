package com.purplepip

import com.purplepip.kotlin.js.demo.Bean
import com.purplepip.kotlin.js.demo.sum
import kotlin.browser.window

/**
 * Example main function. Started at script body.
 * At first time you have to run `mvn package`. 
 * Open example index.html in browser once you compile it.
 */
fun main(args: Array<String>) {
    window.alert("Hello, World! 1 + 2 = " + sum(1,2)
        + " : bean = "
        + Bean("my-bean"))
}

