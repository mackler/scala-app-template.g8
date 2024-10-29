import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object MyProps extends Properties("MyProps"):
  property("myProp1") = forAll: (n: Int, m: Int) =>
    n + m == m + n
