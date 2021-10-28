package com.example.solidprincipledemo

open  class Employee(val name: String, val age:Int, val salary:Int) {
    init {
        println("my name is $name  and my salary is $salary")
    }
}