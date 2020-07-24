import com.google.common.base.Strings

buildscript {
    dependencies {
        classpath("com.google.guava:guava:27.0.1-jre")
    }
}

plugins {
    `java-library`
}

tasks.register("hello") {
    doLast {
        println("hello")
        println(Strings.padEnd("A", 10, '.'))

    }
}