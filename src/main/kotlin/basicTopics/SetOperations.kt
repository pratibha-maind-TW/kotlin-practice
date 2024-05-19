package basicTopics

import kotlin.random.Random

class SetOperations {

    val set = mutableSetOf<Int>()

    fun createSet(size : Int){
        for(index in 1.. size)
            set.add(Random.nextInt(99))
    }

    fun printSet(){
        println(set)
    }

    fun findInSet (element: Int) : Boolean{
        return (set.contains(element))
    }
}