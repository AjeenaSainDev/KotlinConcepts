package com.example.solidprincipledemo


object MaximumProfite {
    @JvmStatic
    fun main(args: Array<String>) {
       println("Ajeena".getAscii())
        /*val saving = 250
        val current = intArrayOf(175, 13, 109, 210, 97)
        val future = intArrayOf(200, 125, 128, 228, 133)
        val dp = Array(current.size + 1) {
            IntArray(
                saving + 1
            )
        }
        val n = current.size
        val prof = maxProfit(current, future, n, saving)
        println(prof)*/
      /*  val lambda2 = { println("Hello, world") }
        val sum :(Int,Int)->Int = {a:Int,b:Int->a+b}
        lambda2()
        val result = sum(2,3)
        println("sum $result " )
        fun ExampleExtension.printname(){
            println("extension method")
            
        }
        fun ExampleExtension.getName(){
            println("extension  method  same as memeber")
        }
         val e = ExampleExtension()
        e.getName()
        e.printname()

        fun Addition.doSomeWork(){
            println("operations are done")
        }
        val a:Addition = Addition()
        a.doSomeWork()


       fun Int.checkPositveNegative() :Int{

         return if(this<0)-this else  1

       }
       println(5.checkPositveNegative())

        fun String.getStringLenght() :Int{
            return (this.length)
        }


        fun String.getAscii() :Int{
            var ascii = 0;
            for(i in 0..this.length){
                ascii = ascii+this.get(i).toInt()
                println("ascii$ascii")
            }
            return ascii
        }
        fun String.getNumberofChat():String{
            return (this.replace("\\s", "",false))
        }
        val stringlenght = "Ajeena is good girl".replace(" ","").length
        println("stringlenght$stringlenght")

        val leng = "akhil".getStringLenght()
        println("akhil$leng")

        fun List<String> .swapList(){
            for (item in this){
              println(item)
            }
        }
        val list = listOf("red", "green", "blue")
        list.swapList()

        fun A.operate(a:Int,b:Int): Int{
            return a+b
        }
        fun B.operate(a:Int,b:Int): Int{
            return a*b
        }
      fun Display(a:A){
          print("disaaaa"+a.operate(5,5)+"\n")
      }
       Display(B())
       *//* val web_dev = WebDev("Sona",33,75000)
        web_dev.webDevelop()
        val ios = IosDev("priya",33,50000)
        ios.iosDev()
        val androiddDev = AndroiddDev("Aju",31,80000)
        androiddDev.androidDevelop()*//*

        fun AB?.output(){
            if(this == null){
                println("Null")
            }else{
                println(this.toString())
            }
        }
        val ab = AB("my life is like empty")
        ab.output()
        null.output()

        var primeres = checkPrimeNuber(180)
        when(primeres){
            true -> println("not prime")
            else ->println("prime")

        }

        fun AB .getMyname(){
           println(this.name)
        }
        val ab1 = AB("Malar")
        ab1.getMyname()
     val data = getData()
        when(data){
            is Mysealed.Student ->{
              println(data)
            }
            is Mysealed.College ->{
                println(data)
            }
        }*/
    }
    fun String.getAscii() :Int{
        var ascii = 0;
        for(i in 0..this.length-1){
            ascii = ascii+this.get(i).toInt()
            println("ascii$ascii")
        }
        return ascii
    }

    fun maxProfit(currentValue: IntArray, futureValue: IntArray, n: Int, saving: Int): Int {
        if (n == 0 || saving == 0) return 0
        return if (currentValue[n - 1] < saving) {
           println("valuof n ="+n +"and value of saving ="+saving)
            println ( "futureValue="+ futureValue[n - 1])
            println ( "currentValue="+ currentValue[n - 1])
          Math.max(
                futureValue[n - 1] - currentValue[n - 1] + maxProfit(
                    currentValue,
                    futureValue,
                    n - 1,
                    saving - currentValue[n - 1]
                ),
                maxProfit(currentValue, futureValue, n - 1, saving)
            )
        } else {
            maxProfit(currentValue, futureValue, n - 1, saving)

        }
    }

    fun checkPrimeNuber(n:Int) :Boolean{


        if (n <= 1) return false

        // Check from 2 to n-1

        // Check from 2 to n-1
        for (i in 2 until n)
            if (n % i === 0) return true

        return false
       /* var flag = false;
        var m :Int
       // m=n/2
        if(n <=1){
            flag =false
            return flag
        }
        else if(n ==2){
            flag =true
            return flag
        }
        else{
            for(item in 2.. n){
                if(n %item==0){
                   flag =  true
                    break
                }
            }
        }

     return flag*/
    }

    fun getData(): Mysealed {
        return Mysealed.College("ppp")
    }

    sealed class Mysealed{
        data class Student(val name:String) :Mysealed()
        data class College(val name: String):Mysealed()
        data class Teacher(val dep:String):Mysealed()
    }

}