package com.example.solidprincipledemo

sealed class Response{
data class Succes(val data:String):Response()
data class Error(val data:String):Response()
object Loading:Response()
}
sealed class Operations(){
    class Increment(var a: Int,var b:Int) : Operations()
    class Substracte(var a: Int,var b:Int):Operations()
    class Multiplcation(var a: Int,var b:Int):Operations()
}
fun getResponse():Response{
    return Response.Succes((100..1000).random().toString())
}
fun doCalculations(operations: Operations ){
    when(operations){
        is Operations.Increment ->{
            println(operations.a+operations.b)

    }
        is Operations.Substracte->{
            println(operations.a-operations.b)
        }
        is Operations.Multiplcation->{
            println(operations.a*operations.b)
        }

    }
}
fun main(){
 /*var response = getResponse()
    when(response){
        is Response.Succes ->{
            println(response)
        }
        is Response.Error->{
            println(response)
        }
        is Response.Loading->{
            println(response)
        }
    }*/
doCalculations(Operations.Multiplcation(5,6))

}