package basicTopics

import java.util.Random

class ListOperations {
    val numbers = listOf<Int>(1,2,3,5,7)

    fun createList(size : Int) : List<Int> {
        val newList : MutableList<Int> = mutableListOf()
        for(index in 1..size)
        {
            newList.add(kotlin.random.Random.nextInt())
        }
        return newList
    }
    fun printList(list : List<Int> = numbers){
        for(element in list){
            print(element)
        }
    }
}