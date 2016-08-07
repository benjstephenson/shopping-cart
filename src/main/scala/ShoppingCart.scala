

object ShoppingCart {

  def checkout(products: List[Fruits.Value]): Double = {
    Fruits.products.map { product =>
      val count = products.count(_ == product.id)
      product.checkout(count)
    }.sum
  }
}
