package com.example.solidprincipledemo

fun main(){
  var str = "Hello"
  var new_str = str.padEnd(10,'$')
  println(new_str)
  val message = "n = $new_str"
    println(message)
var a = 10
 var b = 20
 println(a.plus(b))

  val p1 = Point(3, -8)
  val p2 = Point(2, 9)

  var sum = Point()
  sum = p1 - p2

  println("sum = (${sum.x}, ${sum.y})")
}
class Point(val x: Int = 0, val y: Int = 10) {

  // overloading plus function
  operator fun minus(p: Point) : Point {
    return Point(x - p.x, y - p.y)
  }
}
