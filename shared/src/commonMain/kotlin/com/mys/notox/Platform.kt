package com.mys.notox

interface Platform {
    val name: String
}


interface Person{
    val name:String
}


expect fun getPerson(): Person

expect fun getPlatform(): Platform


