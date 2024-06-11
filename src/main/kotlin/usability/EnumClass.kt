package usability

enum class Priority(val value: String){
    LOW(value = "Low"),
    MEDIUM(value = "Medium"),
    HIGH(value = "High")
}

fun main(){
    println(Priority.LOW.name)
    println(Priority.LOW.value)

    for (value in Priority.values()){
        when(value){
            Priority.LOW -> println("LOW value")
            Priority.MEDIUM -> println("MEDIUM value")
            Priority.HIGH -> println("HIGH value")
        }
    }
}