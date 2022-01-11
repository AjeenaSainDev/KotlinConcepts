package com.example.solidprincipledemo

fun main(){
    println(displayStudent("aju"))
}

fun displayStudent(){
    println("hai no name")
}

fun displayStudent(name:String,id:Int){
    println("name =$name  id = $id")

}
fun displayStudent(name:String): String{
    return "hiii $name"
}
