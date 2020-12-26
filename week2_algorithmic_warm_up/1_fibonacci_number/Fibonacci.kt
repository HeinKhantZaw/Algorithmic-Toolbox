import java.util.*

fun calcFib(n: Long): Long {
    if (n <= 1){
      return n;
    }
    val count = n.toInt()
    var num = LongArray(count) { 1 }    
    for(i in 2..count-1){
      num[i] = num[i - 1] + num[i - 2];
    }
    return num[count - 1];
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()

    println(calcFib(n))
}