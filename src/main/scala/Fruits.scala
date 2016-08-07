
object Fruits extends Enumeration {
  val apple, orange = Value

  sealed trait Fruit {
    val id: Fruits.Value
    val price: Double
    def checkout(count: Int): Double
  }

  case object Apple extends Fruit {
    val id = Fruits.apple
    val price = 0.60
    def checkout(count: Int) = buyNGetNMinus1Free(price, 2)(count)
  }

  case object Orange extends Fruit {
    val id = Fruits.orange
    val price = 0.25
    def checkout(count: Int) = threeforTwo(price)(count)
  }

  val products = Seq(Apple, Orange)

  private def buyNGetNMinus1Free(price: Double, n: Int)(count: Int): Double = {
    val remainder = count % n

    if (count < n) {
      count * price
    } else if (remainder == 0) {
      val free = count / n
      (count - free) * price
    } else {
      val free = count % n
      ((count - free) * price) +
      (remainder * price)
    }
  }

  private def threeforTwo(price: Double)(count: Int): Double = {
    val remainder = count % 3

    if (count < 3) {
      count * price
    } else if (remainder == 0) {
      val freeItems = count / 3
      (count - freeItems) * price
    } else {
      // remainder is how many extra items to add on top of the offer
      val freeItems = count / 3
      ((count - freeItems) * price) + remainder * price
    }
  }
}

