import java.util.Scanner;

public class Main {
    static int fib(int n){
        if (n == 1 || n == 2) return 1;
        else return (fib(n - 1) + fib(n - 2));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       System.out.println(fib(n) +" "+ (n-2));
    }
}
