package com.mys.notox

class Greeting {
    private val platform: Platform = getPlatform()
    private val person: Person = getPerson()

    fun greet(): String {
        return "Hello, ${person.name}!"
    }
}



