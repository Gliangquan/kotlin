/**
 * 关联关系表示一个类依赖于另一个类的实例。关联可以是单向的（一个类知道另一个类）或双向的（两个类互相知道对方）。
 * Car 类通过关联关系依赖于 Driver 类。Car 类拥有一个 Driver 对象，并通过该对象调用信息。
 */

class Driver(val name: String)

class Car(val driver: Driver) {
    fun drive() {
        println("${driver.name} is driving the car.")
    }
}

fun main() {
    val driver = Driver("Alice")
    val car = Car(driver)
    car.drive()  // 输出: Alice is driving the car.
}