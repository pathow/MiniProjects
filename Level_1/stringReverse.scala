/**
 * Created by patrick on 7/25/15.
 * Note: Need to start REPL with scala -Xnojline, if want to see inputs as they are typed
 * Manual coding of a string reversal function
 */
import scala.io.StdIn._

def reverse(s: String): String = (for (i <- s.length until 0 by -1) yield s(i-1)).mkString

val result = reverse(readLine("Enter string to be reversed here: "))
println(result)