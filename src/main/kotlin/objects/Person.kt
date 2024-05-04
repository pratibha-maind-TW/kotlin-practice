package objects

class Person (val name: String = "Unknown", val age: Int = 18) {

    fun printName(){
        println(name)
    }

}

fun printNameAndAgeOfPerson(name: String = "Unknown", age: Int = 18){
    println("Name : $name and Age: $age")
}