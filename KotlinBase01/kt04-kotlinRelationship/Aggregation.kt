/**
 * 聚合也是一种“拥有”关系，但不同于组合关系的是，聚合关系中的类可以独立存在，不依赖于主类。
 * Wheel 类和 Car 类之间是聚合关系，Wheel 对象在 Car 之外也可以存在。
 */

class Wheel

class Car(val wheels: List<Wheel>) {
    fun showWheels() {
        println("Car has ${wheels.size} wheels.")
    }
}

fun main() {
    val wheels = List(4) { Wheel() }
    val car = Car(wheels)
    car.showWheels()  // 输出: Car has 4 wheels.
}