

object ShoppingCart {

  def checkout(products: List[Fruits.Value]): Double = {
    products.map(Fruits.prices(_)).sum
  }
}
