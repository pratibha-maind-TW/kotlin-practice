package oopsConcepts.models

import oopsConcepts.models.Animal

open class Dog(name: String ): Animal {
    override val name: String = name
    override val sound: String= "bark"
    override fun eat() {
        println("$name is eating..")
    }
    fun bark() {}

}