package com.example.exercise3
//WAP to create singleton class
object myName {
    var fname="Krishna"
    var lname="Pratap"
}
fun main(args: Array<String>){
    println(myName.fname)
    println(myName.lname)
}