// 使用 if/else 语句来表达条件
fun doifelse() {
    val trafficLightColor = "Black"
    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}
fun doifelse2() {
    val trafficLightColor = "Black"
    val message =
      if (trafficLightColor == "Red") "Stop"
      else if (trafficLightColor == "Yellow") "Slow"
      else if (trafficLightColor == "Green") "Go"
      else "Invalid traffic-light color"

    println(message)
}

// 使用 when 语句处理多个分支
fun dowhen() {
    val trafficLightColor = "Amber"
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}
fun dowhen2() {
    val trafficLightColor = "Amber"
    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Proceed with caution."
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}

fun main() {
    doifelse()
    dowhen()
    println("-------------")
    doifelse2()
    dowhen2()
}

/**
总结:
在 Kotlin 中，可以使用 if/else 或 when 条件来实现分支。
仅当 if 分支条件中的布尔表达式返回 true 值时，系统才会执行 if/else 条件中的 if 分支的正文。
仅当前面的 if 或 else if 分支返回 false 值时，系统才会执行 if/else 条件中的后续 else if 分支。
仅当前面的所有 if 或 else if 分支均返回 false 值时，系统才会执行 if/else 条件中的最后一个 else 分支。
当分支数量超过两个时，建议使用 when 条件来替换 if/else 条件。
您可以在 when 条件中使用英文逗号 (,)、in 范围和 is 关键字来编写更复杂的条件。
if/else 和 when 条件可以用作语句或表达式。
*/

