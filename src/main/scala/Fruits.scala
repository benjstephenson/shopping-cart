
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
    def checkout(count: Int) = count * price
  }

  case object Orange extends Fruit {
    val id = Fruits.orange
    val price = 0.25
    def checkout(count: Int) = count * price
  }

  val products = Seq(Apple, Orange)
}

