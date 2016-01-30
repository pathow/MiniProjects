import scala.collection.mutable.ArrayBuffer
import scala.math.BigDecimal

/**
  * Created by Patrick on 1/30/2016.
  */


def calcReturn(cash: Double, price: Double) = {
  val changeDenom = Array(0.25, 0.1, 0.05, 0.01)
  val coinNames = Array("Quarter", "Dime", "Nickel", "Penny")

  var changeCount: ArrayBuffer[Integer] = new ArrayBuffer[Integer]()

  var difference = BigDecimal(cash - price).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

  for (coin <- changeDenom) {
    val coinNum = (difference / coin).toInt
    changeCount += coinNum
    difference -= coinNum*coin
  }

  for (i <- 0 to (changeCount.length -1)){
    println(changeCount(i) + " " + coinNames(i))
  }
}
