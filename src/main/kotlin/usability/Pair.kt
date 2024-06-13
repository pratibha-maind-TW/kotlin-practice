package usability

fun main(){
    val pair = Pair(105, "Pune")
    println(pair.first)
    println(pair.second)
    println(pair.toString())

    val (code, name) = pair
    println(code)
    println(name)

    val map = mapOf(105 to "Pune",
        206 to "Mumbai")
    println(map.size)    // No.of Entries

    map.forEach{
        (key, value) ->
            println("$key to $value")
    }

    map.forEach{
        entry ->
        println("${entry.key} to ${entry.value}")
    }

    map.forEach{
            entry ->
        val (code, name) = entry       // Destructuring the entries
        println(code)
        println(name)
    }

}