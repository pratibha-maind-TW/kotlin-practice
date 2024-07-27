package oopsConcepts.models

class CleaningRobot : Robot {
    override fun move(){
        println("Moving...")
    }

    fun clean(){
        println("Cleaning robot is cleaning....")
    }
}