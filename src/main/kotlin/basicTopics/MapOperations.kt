package basicTopics

class MapOperations {

    private val map = mutableMapOf<String, String>()

    fun addToMap (key : String, value : String){
        map[key] = value
    }

    fun printMap()
    {
        println(map)
    }

    fun printMapKeys(){
        println(map.keys)
    }

    fun printMapValues(){
        println(map.values)
    }

    fun printKeyAndValue(){
//        for (entry in map)
//            println("${entry.key} : ${entry.value}")
//
//        for ((key, values) in map)
//            println("$key : $values")

        map.forEach { (key, value) ->
            println("$key : $value")
        }
    }
}