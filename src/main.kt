fun main() {
    //kotlin does not support implicit type conversion eg an int value cannot be
    //..assigned to  long type but this is possible in java
    //We use helper functions in kotlin to explicitly convert one type to another

    var long = 200;
    var convertolong: Long = long.toLong()
    println(convertolong)
}