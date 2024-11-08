// 在 Kotlin 中使用可为 null 性 and null 的安全的重要性
// https://developer.android.com/codelabs/basic-android-kotlin-compose-nullability?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%3Fhl%3Dzh-cn&hl=zh-cn#0

fun donull01() {
    val favoriteActor = null 
    println(favoriteActor) // null
}
fun donull02() {
    // var favoriteActor = null // 编译错误, 因为 favoriteActor 的类型是 String，而 String 不是可空的，不可为null变量
    // var favoriteActor: String = "Sandra Oh" 
    var favoriteActor: String? = "Sandra Oh"  // favoriteActor 的类型是 String?，而 String? 是可空的，可为null变量
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}

fun donull03() {
    var favoriteActor: String = "Sandra Oh" // 不可为null变量
    println(favoriteActor.length) // 9 . 运算符访问 不可为null 的变量的方法和属性
}
fun donull04() {
    var favoriteActor: String? = "Sandra Oh" // 可为null变量
    // println(favoriteActor.length) // . 运算符不能访问 可为null 的变量的方法和属性，编译错误
    println(favoriteActor?.length) // 安全调用运算符（?.）可以访问 可为null 的变量的方法和属性
}

fun main() {
    /**
     * 1. 使用可为 null 的变量`
     * 注意：尽管您应对可存储 null 值的变量使用可为 null 的变量，
     * 但对于永远不能存储 null 值的变量，仍应使用不可为 null 的变量，
     * 这是因为访问可为 null 的变量时需要进行更复杂的处理。
     */
    println("---使用可为 null 的变量---")
    donull01()
    println("------------------------")
    donull02()
    println("---处理可为 null 的变量---")
    donull03()
    donull04()


}



