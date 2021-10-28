package com.example.solidprincipledemo

fun main(args: Array<String>) {
    println("hello")
    val arrayUtiil = ArrayUtiil<Int>(arrayOf(1,2,3,4,5,6,7))
    val arrayUtiil1 = ArrayUtiil<String>(arrayOf("jjj","djjj"))

    arrayUtiil1.findElement("jjjj"){index, element ->
        println("Index $index"+"\n"+"element$element")
    }
}
class ArrayUtiil<T>(private  val array: Array<T>) {
fun findElement(element:T,foundItem:(index:Int,element:T?)->Unit){
    for(i in array.indices){
        if (array[i]== element)
        {
            foundItem(i,array[i])
            return
        }

    }
    foundItem(-1,null)
    return
}
}