package oopsConcepts.models

import oopsConcepts.models.Animal

class Cat(name: String) : Animal {
    override val name: String = name
    override val sound: String = "Meow"

    override fun walk() {
        println("$name is walking..")
    }

    override fun eat() {
        println("$name is eating..")
    }

    fun hiss(){}

}