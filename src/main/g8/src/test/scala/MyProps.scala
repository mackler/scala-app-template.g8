import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableFor2
import org.scalatest.propspec.AnyPropSpec
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class MyProps extends AnyPropSpec with ScalaCheckPropertyChecks with Matchers:

  property("commutativity of integer addition"):
    forAll: (n: Int, m: Int) =>
      (n + m) should equal (m + n)

  property("addition without a generator"):
    forAll(TableFor2(("int", "int"), (2, 2))): (a, b) =>
      (a + b) should equal (4)
