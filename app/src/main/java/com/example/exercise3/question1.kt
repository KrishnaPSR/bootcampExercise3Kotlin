package com.example.exercise3
//program to print classnotfound Exception
fun main(args: Array<String>) {
    try {
        Class.forName("Bootcamp")
    } catch (e: ClassNotFoundException) {
        e.printStackTrace()
        print("Exception ${e.message}")
    }
}
