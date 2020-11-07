fun main() {
    val num = arrayOf(1, 2, 3, 4)   //implicit type declaration
    val num2 = arrayOf<Int>(1, 2, 3) //explicit type declaration
    println(num.size)
    for (element in num){
        println(element)
    }
    //using array constructor
    val num5 = Array(3, {i-> i*1})
    //using built in factory methods
    val num4 = intArrayOf(1, 2, 3, 4)
    //get and set methods of array and also index [] operator...
    //TRAVERSING
    for(i in num.indices){
        println(num[i])
    }
    for (i in 0..10){
        println(i)
    }
    num2.forEach({index->println(index)})
    //Once you create an array, the size is
    // fixed. You can't add or remove elements, except by copying to a new array.
}