package com.purplepip

import com.purplepip.kotlin.js.demo.DataBean
import com.purplepip.kotlin.js.demo.MyBean
import com.purplepip.kotlin.js.demo.product
import com.purplepip.kotlin.js.demo.sum
import kotlin.browser.window

/**
 * Example main function. Started at script body.
 * At first time you have to run `mvn package`. 
 * Open example index.html in browser once you compile it.
 */
fun main(args: Array<String>) {
    window.alert("Hello, World! "
        + " : 5 + 4 = " + sum(5,4)
        + " : 5 * 4 = " + product(5,4)
        + " : data bean = "
        + DataBean("data-bean")
        + " : my bean = "
        + MyBean("my-bean").getNameInUpperCase())
}

