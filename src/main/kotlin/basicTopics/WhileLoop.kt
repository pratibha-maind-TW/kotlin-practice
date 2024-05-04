package basicTopics

class WhileLoop {

    fun printLetterInString(string :String){
        var length = 0
        while(length < string.length){
            println(string[length])
            length++
        }
    }
}