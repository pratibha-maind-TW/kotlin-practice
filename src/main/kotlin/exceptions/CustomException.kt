package exceptions

class CustomException (
    message: String
): Exception(){
    init {
        println(message)
    }
}