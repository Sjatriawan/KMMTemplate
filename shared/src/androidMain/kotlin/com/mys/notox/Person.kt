package com.mys.notox

class AndroidPerson : Person {
    override val name: String = "M Yogi Android"
}

actual fun getPerson(): Person = AndroidPerson()
