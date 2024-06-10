package usability

class WhenBlock (){
    fun runWhen(num: Int){
        when(num) {
            1 -> {
                println("This is one")
            }
            2 -> {
                println("This is two")
            }
            else -> {
                println("number other than 1 and 2")
            }
        }
    }
}