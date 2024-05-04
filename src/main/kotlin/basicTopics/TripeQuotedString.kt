package basicTopics

class TripeQuotedString {
    fun printTrippleQuotedString() : String{
        val text = """Hello world! 
            |this is a triple quoted string
            |where marginPrefix is |
        """.trimMargin()
        return text
    }
}