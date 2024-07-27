package oopsConcepts.models

interface Animal {
    val name: String

    fun walk(){
        println("$name is Walking")
    }

    fun eat();
}