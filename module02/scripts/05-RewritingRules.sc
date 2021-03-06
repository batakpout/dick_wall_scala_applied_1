val x = 1 + 2

val y = 1.+(2)

val s = "hello"

s.charAt(1)

/** infix notation
It works for all the methods on an instance
 with one parameter
 i.e methods with single parameter
 */
s charAt 1 //infix notation

// println "hello" // will not compile

System.out println "hello"

// --- apply and update

val arr = Array("scooby", "dooby", "doo")

val yy : String = arr.apply(1)

val xx: String = arr(0)


val r: Unit = arr.update(0, "scrappy")

arr(1) = "dappy"

println(arr.deep)

val arr2 = Array.apply(1,2,3)

val z = 10
// z(2) // does not compile

val xs = List(1,2,3)
xs(1)  // works
// xs(1) = 10 // does not compile


