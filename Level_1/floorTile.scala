/**
 * Created by patrick on 7/18/15.
 Difficulty 1 Project: Find Cost of Tile to Cover W x L Floor
 Finished secondary "added difficulty" (labor costs)
 Additional possibility: make flexible enough to handle non-rectangular rooms
 */

def tiles(w: Int, l: Int, cost: Double): Double = {
  var total = w * l * cost
  var hours = total/20.0
  total + (hours*86.00)
}


