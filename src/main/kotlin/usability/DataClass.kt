package usability

data class Employee(
    val ID :Int,
    val name : String
) {

}

fun main(){
    val employee = Employee(1000, "Nitya")
    println("${employee.toString()}")

    val employee2 = employee
    println("${employee2.toString()}")

    val employee3 = employee.copy(name = "Raj")
    println("${employee3.toString()}")

    println("${employee3.equals(employee)}")

    val (id, name) = employee       // destructuring instance/object
    println("Id = $id and name = $name")

}