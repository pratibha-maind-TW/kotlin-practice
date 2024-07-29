package oopsConcepts.models

//Nested classes
class Airport(val regNo : Int) {
    class Plane(val model : String){
        fun printPlaneInfo(){
            println("Plane is of $model type")
        }
    }
    fun printInfo(){
        println("Airport: $regNo")
    }
    fun printAllInfo(plane: Plane){
        println("Airport: $regNo\nPlane is of ${plane.model} type")
    }
}

fun main(){
    val airport = Airport(1234)
    val plane = Airport.Plane("cargo")

    plane.printPlaneInfo()

    airport.printInfo()

    airport.printAllInfo(plane)
}