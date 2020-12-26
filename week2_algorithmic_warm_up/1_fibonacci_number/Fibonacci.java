import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;
    int [] num = new int [n];
    num[0] = 1;
    num[1] = 1;
    for(int i = 2; i < n;i++){
      num[i] = num[i - 1] + num[i - 2];
    }
    return num[n - 1];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
