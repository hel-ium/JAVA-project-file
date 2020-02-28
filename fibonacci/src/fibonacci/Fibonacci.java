package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        number = num.nextInt();
        fibfunction f = new fibfunction();
        int fibo = fibfunction.fib(number);
        System.out.println(fibo);
    }

}
