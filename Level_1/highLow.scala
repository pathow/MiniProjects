/**
 * Created by patrick on 7/23/15.
 * Note: Need to start REPL with scala -Xnojline, if want to see inputs as they are typed
 * High/Low number guessing game, very rough at the moment
 */

import scala.io.StdIn._

val r = scala.util.Random

var target = r.nextInt(100)

var candidate = -1

do{
  println("Enter a number between 0 and 100: ");
  candidate = readInt();

  if(candidate < target){
    println("Too low")
  } else if (candidate > target){
    println("Too high")
  } else {
    println("You got it right!!!")
  }
}while(candidate != target);


