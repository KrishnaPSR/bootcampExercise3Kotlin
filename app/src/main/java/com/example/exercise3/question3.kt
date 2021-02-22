package com.example.exercise3

sealed class Base{
    class A{}
    class B{}
    class C{}

}
fun getClassName(base: Any){
    when(base){
        is Base.A->{
            println("A")
        }
        is Base.B->{
            println("B")
        }
        is Base.C->{
            println("C")
        }
        else ->{
            print("Invalid")
        }
    }
}
fun main(args: Array<String>){
    getClassName(Base.A())
    getClassName(Base.B())
    getClassName(Base.C())
}