package exceptions

fun main(){

    try{
        convertStringtoInt("1233")
    }catch(e : NumberFormatException){
        println("This is Wrong Value, Please provide correct details")
    }
//    convertStringtoInt("Json")

    try{
        throwException()
    }catch (e: CustomException){}

    println("This is end of function")
}


fun convertStringtoInt(value :String) : Int {
    val num = value.toInt()
    return num
}

fun throwException(){
    throw CustomException("This is Custom Exception")
}