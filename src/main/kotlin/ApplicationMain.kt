import basicTopics.WhileLoop
import objects.BasicClass
import objects.Person

fun main() {

//    val tripleQuotedString = TripeQuotedString()
//    print("${tripleQuotedString.printTrippleQuotedString()}")
//    val whileLoop = WhileLoop()
//    print(whileLoop.printLetterInString("Hello world"))

//// Objects - creating a object of a class
//    val classB = BasicClass()
//    classB.toPrint()

    //Constructor
    val person1 = Person()
    person1.printName()
    val person2 = Person("Rowam")
    person2.printName()
}

