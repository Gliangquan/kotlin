/**
 * 继承是一种 is-a 关系，用于表示一个类是另一个类的子类。通过继承，子类可以复用父类的属性和方法。
 * 在 Kotlin 中，类默认是 final 的，不能被继承。通过 open 关键字可以让类变成可继承的。
 */

// 父类
open class Animal(val name: String) {
    init {
        println("$name is a ${this.javaClass.simpleName}.")
    }
    fun eat() {
        println("$name is eating.")
    }
}

// 子类
class Dog(name: String) : Animal(name) {
    fun bark() {
        println("$name is barking.")
    }
}

fun main() {
    val dog = Dog("Buddy") // 输出: Buddy is a Dog.
    // dog.eat()   // 输出: Buddy is eating.
    // dog.bark()  // 输出: Buddy is barking.
}