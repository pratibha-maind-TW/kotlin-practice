import usability.WhenBlock
import objects.Person

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

//    //List
//
//    val list = ListOperations()
//    list.printList()
//    val newList = list.createList(6)
//    print(newList)

//    //set
//    val set = SetOperations()
//    set.createSet(size = 10)
//    set.printSet()
//    print(set.findInSet(element = 22))

//    //Map
//
//    val map = MapOperations()
//    map.addToMap(key = "Cat", value = "Meow")
//    map.addToMap(key = "Bird", value = "Chirp")
//    map.addToMap(key = "Dog", value = "Bark")
//
//    map.printMap()
//    map.printMapKeys()
//    map.printMapValues()
//    map.printKeyAndValue()

//    //Extension function
//
//    val name = ExtentionFunctions()
//    name.printName()
//
//    println("${name.formString()}")

    //overloading
    val name = Person()
    name.printName()
    name.printName("Pratibha")

    //when
    val obj = WhenBlock()
    obj.runWhen(2)
    obj.runWhen(5)

}

//// Creating Extention function for a class
//fun ExtentionFunctions.formString() :String {
//    return "My name is ${this.name}"
//}
