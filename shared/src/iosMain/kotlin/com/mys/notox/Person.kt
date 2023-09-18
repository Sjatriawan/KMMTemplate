package com.mys.notox


class IOSPerson: Person {
    override val name: String = "M Yogi IOS"
}

actual fun getPerson(): Person = IOSPerson()