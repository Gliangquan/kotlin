/**
 * 接口是一种契约，定义了类必须实现的方法，但不提供具体实现。类可以实现多个接口，这是一种 can-do 关系。
 * Car 类实现了 Drivable 接口，而 Airplane 实现了 Flyable 接口。每个类都提供了自己的方法实现。
 */

 interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class Car : Drivable {
    override fun drive() {
        println("Car is driving.")
    }
}

class Airplane : Flyable {
    override fun fly() {
        println("Airplane is flying.")
    }
}

fun main() {
    val car = Car()
    car.drive()  // 输出: Car is driving.

    val airplane = Airplane()
    airplane.fly()  // 输出: Airplane is flying.
}

 