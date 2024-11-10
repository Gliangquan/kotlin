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

/**
 * 定义构造函数
 * Kotlin 中的构造函数主要有两类：
 * 主要构造函数：一个类只能有一个主要构造函数（在类标头中定义）。主要构造函数可以是默认构造函数，也可以是形参化构造函数。主要构造函数没有主体，表示其中不能包含任何代码。
 * 辅助构造函数：一个类可以有多个辅助构造函数。您可以定义包含形参或不含形参的辅助构造函数。辅助构造函数可以初始化类，具有包含初始化逻辑的主体。如果类有主要构造函数，则每个辅助构造函数都需要初始化该主要构造函数。
 *  */ 
// 1. 主构造函数
class Person(val name: String) {
    // 2. 初始化代码块。init 块会在对象创建时自动执行。
    init {
        println("Person created with name = $name")
    }

    var age: Int = 0
    // 辅助构造函数，初始化 age 属性（: this(name)）
    // Kotlin 支持一个或多个次构造函数，使用 constructor 关键字声明。
    // 次构造函数可以提供不同的初始化方式，但必须调用主构造函数（直接或间接），如果主构造函数存在的话。
    constructor(name: String, age: Int) : this(name) {
        this.age = when (age) {
            in 0..100 -> age
            else -> throw IllegalArgumentException("Age must be between 0 and 100")
        }
    }
}


fun main() {
    val smartTvDevice = SmartDevice() // 创建类对象
    println("Device name is: ${smartTvDevice.name}") // 访问类属性
    smartTvDevice.turnOn() // 调用类方法
    smartTvDevice.turnOff()

    smartTvDevice.speakerVolume = 5 // 调用类属性的setter函数
    println("Speaker volume is: ${smartTvDevice.speakerVolume}") // 调用类属性的getter函数

    // 构造函数：
    println("----------")
    val person1 = Person("Alice")
    val person2 = Person("Bob", 30)
    println("Person1: Name = ${person1.name}, Age = ${person1.age}")
    println("Person2: Name = ${person2.name}, Age = ${person2.age}")

}