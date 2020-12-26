import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun getMaxPairwiseProduct(numbers: LongArray): Long {
    var result: Long = 0
    val n = numbers.size
    Arrays.sort(numbers)
    result = (numbers[n-1]*numbers[n-2]).toLong()
    return result
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val numbers = LongArray(n)
    for (i in 0 until n) {
        numbers[i] = scanner.nextLong()
    }
    println(getMaxPairwiseProduct(numbers))
}