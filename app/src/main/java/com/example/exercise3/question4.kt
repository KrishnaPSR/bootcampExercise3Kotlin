package com.example.exercise3
//WAP to create extension function.
fun String.myName():Boolean{
    return this.contains("k")
}
fun main(args:Array<String>){
    println("krishna".myName())
    println("pratap".myName())
}