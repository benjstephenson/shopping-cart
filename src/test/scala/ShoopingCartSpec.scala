import org.scalatest.{FlatSpec, Matchers}


class ShoppingCartSpec extends FlatSpec with Matchers {

  "a shopping cart" should "produce the right total" in {
    //ShoppingCart.checkout(List(Fruits.apple)) shouldBe 0.60
    //ShoppingCart.checkout(List(Fruits.apple, Fruits.apple)) shouldBe 0.60
    //ShoppingCart.checkout(List(Fruits.apple, Fruits.apple, Fruits.apple)) shouldBe 1.20
    ShoppingCart.checkout(List(Fruits.orange, Fruits.orange)) shouldBe 0.50
    //ShoppingCart.checkout(List(Fruits.apple, Fruits.apple, Fruits.orange, Fruits.apple)) shouldBe 2.05
    ShoppingCart.checkout(List(Fruits.orange, Fruits.orange, Fruits.orange)) shouldBe 0.5
    ShoppingCart.checkout(List(Fruits.orange, Fruits.orange, Fruits.orange, Fruits.orange)) shouldBe 0.75

  }

}
