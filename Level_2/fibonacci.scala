/**
  * Created by Patrick on 1/30/2016.
  */

// BigInts to cover large n edge cases

def fibonacci(n: Integer): BigInt = {
  var prev: BigInt = 0
  var current: BigInt = 1
  for (i <- 1 to (n - 1)) {
    val next: BigInt = prev + current

    prev = current
    current = next
  }
  prev
}


def fibonacciRecursive(n: Integer): BigInt =
  if (n == 1) {
    0
  } else if (n == 2) {
    1
  }
  else{
    fibonacciRecursive(n-1) + fibonacciRecursive(n-2)
  }