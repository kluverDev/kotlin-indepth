fun main() {
   //To create an empty string in Kotlin, we need to create
    // an instance of String class.
    var variable_name = String()
    //string template
    val str = "Geeks"
    println("$str is a string which length is ${str.length}")
    var s =" String"
    println(s.length)
    s.subSequence(1, 4)
    val pareTo = s.compareTo("String")
    println(pareTo)
}