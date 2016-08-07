
object Fruits extends Enumeration {
  val apple, orange = Value

  val prices: Map[Fruits.Value, Double] = Map(apple -> 0.60, orange -> 0.25)
}
