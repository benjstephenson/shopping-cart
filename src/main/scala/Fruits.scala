
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
    def checkout(count: Int) = bogof(price)(count)
  }

  case object Orange extends Fruit {
    val id = Fruits.orange
    val price = 0.25
    def checkout(count: Int) = count * price
  }

  val products = Seq(Apple, Orange)

  private def bogof(price: Double)(count: Int): Double = {
    val remainder = count % 2
    if (remainder == 0) count / 2 * price
    else (count / 2 * price) + (remainder * price)
  }
}

