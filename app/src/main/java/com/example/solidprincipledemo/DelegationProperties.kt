package com.example.solidprincipledemo

import kotlin.reflect.KProperty

fun main(){
       val student = Student()
    student.firstname = "ajeena"
    student.lastname = "AkhilRaj"
    println(student)
}
class Student{
    var firstname: String? by StudentDelgate()

    var lastname:String? by StudentDelgate()
    override fun toString(): String {
        return "$firstname$lastname"
    }
}
class StudentDelgate{
    var formattedvalue: String? = null
    operator  fun  setValue(thisRef:Any?,
                            property:KProperty<*>,
                            value: String?
    ){
         if (value != null && value.length > 5) {
             formattedvalue = value.trim().toUpperCase()
    }
    }

    operator  fun getValue(thisRef:Any?, property:KProperty<*>) :String ?   {
        return formattedvalue
    }
}