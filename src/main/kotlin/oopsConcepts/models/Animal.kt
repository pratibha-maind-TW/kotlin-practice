package oopsConcepts.models

interface Animal {
    val name: String
    val sound: String

    fun walk(){
        println("$name is Walking")
    }

    fun eat();
}