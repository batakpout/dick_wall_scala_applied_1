val add3Nums = (a: Int, b: Int, c: Int) => a + b + c

val add6and3 = add3Nums(6, _: Int, 3)

add6and3(5)

def add3Method(a: Int, b: Int, c: Int) = a + b + c

val add4and7 = add3Method(4, _: Int, 7)
val add4and7Again = add3Method(4, _, 7)

add4and7(2)
add4and7Again(2)
//below not fully partially applied function, as we are
//not applying any of the arguments
val add3Functionv1: (Int, Int, Int) => Int = add3Method(_, _, _)
add3Functionv1(1,2,3)

val add3Functionv2: (Int, Int, Int) => Int = add3Method _ //eta expansion
add3Functionv2(1,2,3)

def compareTriplets(xs: List[Int], compare: (Int, Int, Int) => Int): List[Int] = {
  for (triplet <- xs.sliding(3)) yield {
    compare(triplet(0), triplet(1), triplet(2))
  }
}.toList

val nums = (1 to 10).toList

compareTriplets(nums, add3Functionv1)
compareTriplets(nums, add3Functionv2)
compareTriplets(nums, add3Method)  // eta expansion by compiler


//answer this
val zipped: List[(Int, Int)] = List(1,2,3).zip(List(2,3,4))
zipped.map{case (x, y) => x * y} // why case is needed here ::TODO, find in partial functions