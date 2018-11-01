import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
}

class Num_Power_Of_Num_Test extends FunSuite {
  test("HelloWorld.num_power_of_num") {
    assert(HelloWorld.num_power_of_num(4) === 16)
  }
}
