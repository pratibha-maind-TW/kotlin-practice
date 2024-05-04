package objects

//creating a class
class BasicClass {
    private val firstM: Int = 100       //property
    private val text: String = "Hello"  //property

    // creating member function
    fun toPrint(){
        println(this.firstM)
        println(this.text)
    }
}