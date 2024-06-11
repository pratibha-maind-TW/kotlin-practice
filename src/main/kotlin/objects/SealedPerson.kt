package objects

import java.util.Random

sealed class SealedPerson {

    class Male() : SealedPerson(){
        fun print(){
            println("This is Male class")
        }

    }

    class Female() : SealedPerson(){
        fun print(){
            println("This is Female class")
        }
    }
}

fun main(){
    fun getPerson() : SealedPerson{
        return if (kotlin.random.Random.nextInt(from = 1, until = 3) == 1) SealedPerson.Male() else SealedPerson.Female()
    }

    fun printPerson() {
        when(val person = getPerson()){
            is SealedPerson.Male -> person.print()
            is SealedPerson.Female -> person.print()
        }
    }
    printPerson()
}