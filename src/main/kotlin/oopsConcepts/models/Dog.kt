package oopsConcepts.models

import oopsConcepts.models.Animal

class Dog(name: String ): Animal {
    override val name: String = name
    override fun eat() {
        println("$name is eating..")
    }
    fun bark() {}

}