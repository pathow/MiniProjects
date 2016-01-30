/**
 * Created by patrick on 7/22/15.
 *  Difficulty 1 Project: Tax Calculator
 Finished secondary "added difficulty" by making it able to handle lists of items
 Additional possibility: Make GUI for it
 */

def taxCalc(amount: Double, tax: Double): Unit = {
  if(tax < 1.0){
    val total = amount * (1+tax)
    println(f"Total is $total%.2f")
  }else{
    val total = amount * (1 + (tax/100.0))
    println(f"Total is $total%.2f")
  }

}

taxCalc(10.00, 5)
taxCalc(10.00, 0.1)

def sum(xs: List[Double]): Double = {
  xs match {
    case x :: tail => x + sum(tail) // if there is an element, add it to the sum of the tail
    case Nil => 0 // if there are no elements, then the sum is 0
  }
}

def taxCalc2(items: List[Double], tax: Double): Unit = {
  if(tax < 1.0){
    val total = sum(items) * (1+tax)
    println(f"Total is $total%.2f")
  }else{
    val total = sum(items) * (1 + (tax/100.0))
    println(f"Total is $total%.2f")
  }

}

val bill = List(10.00, 20.00, 30.00)

taxCalc2(bill, 5)
taxCalc2(bill, 0.1)