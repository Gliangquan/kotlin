/**
 * 组合 是一种强关联关系，表示一个类“拥有”另一个类。组合关系中的类是主类不可分割的一部分，通常主类销毁时，组合的类实例也会销毁。
 * Car 类组合了 Engine 类。Engine 是 Car 类的一个组成部分，不能独立存在。 
 *  */

 class Engine {
    fun start() {
        println("Engine started.")
    }
}

class Car {
    private val engine = Engine()
    
    fun startCar() {
        engine.start()
        println("Car started.")
    }
}

fun main() {
    val car = Car()
    car.startCar()
}