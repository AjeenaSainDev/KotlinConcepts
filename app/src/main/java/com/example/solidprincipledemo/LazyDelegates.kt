package com.example.solidprincipledemo

import kotlin.properties.Delegates

fun main(){
val person = Person().apply {
    myage = 30
    myage = 31
    employee_salary = 4500
    employee_salary = 4000
    employee_salary = 300
    employee_salary = 777777
    println(heavy)

   }


}
class Person{
    val heavy by lazy { StudentHeavy() }
    val lazy_name by lazy {String}
    var myage :Int by Delegates.observable(29){
        property, oldValue, newValue ->
        println("oldValue $oldValue")
        println("newValue $newValue")
    }

    var employee_salary : Int by Delegates.vetoable(5000){
        property, oldValue, newValue ->
         println("oldValue $oldValue")
         println("newValue $newValue")
         newValue>= 5000
    }
}
class StudentHeavy{
    init {
        println("Initlized heavy")
    }
}
