package oopsConcepts.models

class CleaningRobotDog(val name: String){
    val dog: Dog = Dog(name)
    val cleaningRobot: CleaningRobot = CleaningRobot()

    fun clean(){
        cleaningRobot.clean()
    }
    fun bark(){
        dog.bark()
    }

    fun dayRoutine(){
        dog.walk()
        dog.eat()
        cleaningRobot.move()
        cleaningRobot.clean()
        cleaningRobot.move()
    }
}

fun main(){
    val cleaningRobotDOg = CleaningRobotDog( "Jerry")

    cleaningRobotDOg.dayRoutine()
}