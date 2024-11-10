/** 
 * k03-在 Kotlin 中使用类和对象
 * 面向对象的编程 (OOP) 封装，抽象，继承，多态
*/

class SmartDevice {
    val name = "Android TV" // 定义类属性
    val category = "Entertainment"
    var deviceStatus = "online"

    var speakerVolume = 2 // 定义类属性的getter和setter，val 类型的变量为只读变量，因此不含 set() 函数。
    get(){
        println("Getting speaker volume")
        return field
    }
    // get() = field // 简写形式
    set(value) {
        if (value in 0..100) { // 0..100 是一个左闭右闭区间
            println("Setting speaker volume to $value")
            field = value
        }
        println("Speaker volume should be between 0 and 100")
    }

    // 定义类方法
    fun turnOn() {
        println("Smart device is turned on.")
    }
    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice() // 创建类对象
    println("Device name is: ${smartTvDevice.name}") // 访问类属性
    smartTvDevice.turnOn() // 调用类方法
    smartTvDevice.turnOff()

    smartTvDevice.speakerVolume = 5 // 调用类属性的setter函数
    println("Speaker volume is: ${smartTvDevice.speakerVolume}") // 调用类属性的getter函数

}