import basicTopics.ListOperations
import basicTopics.WhileLoop
import objects.BasicClass
import objects.Person
import objects.printNameAndAgeOfPerson as nameAndAge
fun main() {

//    val tripleQuotedString = TripeQuotedString()
//    print("${tripleQuotedString.printTrippleQuotedString()}")
//    val whileLoop = WhileLoop()
//    print(whileLoop.printLetterInString("Hello world"))

//// Objects - creating an object of a class
//    val classB = BasicClass()
//    classB.toPrint()

//    //Constructor
//    val person1 = Person()
//    person1.printName()
//    val person2 = Person("Rowam")
//    person2.printName()

//    nameAndAge("Rhyle", 34)

    //List

    val list = ListOperations()
    list.printList()
    val newList = list.createList(6)
    print(newList)
}

