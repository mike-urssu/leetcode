package easy

fun main() {
    val twoSum = TwoSum()
    println(twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
    println(twoSum.twoSum(intArrayOf(3, 2, 4), 6).contentEquals(intArrayOf(1, 2)))
    println(twoSum.twoSum(intArrayOf(3, 3), 6).contentEquals(intArrayOf(0, 1)))
    println(twoSum.twoSum(intArrayOf(0, 1, 2, 0), 0).contentEquals(intArrayOf(0, 3)))
    println(twoSum.twoSum(intArrayOf(-1, -2, -3, -4, -5), -8).contentEquals(intArrayOf(2, 4)))
}
