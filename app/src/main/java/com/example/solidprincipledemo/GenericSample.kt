package com.example.solidprincipledemo

fun main(arrgs:Array<String>){
    /*val student = StudentList(arrayOf("meenu","aju","thangu","aku"))
    val student1 = StudentList(arrayOf(1,2,3,4,5))*/
   displayStudentName(arrayOf(1,2,3,4,5),5){ index, student ->
        println("item found"+"id is $index")
    }
   displayStudentName(arrayOf("meenu","aju","thangu","aku"),"aku"){index, student ->
        println("aku found"+" \n"+"id is $index")
    }
    disaplay("bhghvhf"){s ->  println(s) }

}
fun <T> displayStudentName(student_list:Array<T>,element: T?,foundStudent:(index:Int,student:T?)->Unit){
    for(i in student_list.indices){
        if (student_list[i]== element){
            foundStudent(i,student_list[i])
            return
        }
    }
    foundStudent(-1,null)
}
fun <T> disaplay(x:T?,merge:(s:T?)->Unit){

}
/*
class StudentList<T>(private val student_list:Array<T>){
    fun displayStudentName(element: T?,foundStudent:(index:Int,student:T?)->Unit){
        for(i in student_list.indices){
            if (student_list[i]== element){
                foundStudent(i,student_list[i])
                return
            }
        }
        foundStudent(-1,null)
    }
}*/
