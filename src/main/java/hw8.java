import java.util.Scanner;

public class hw8 {
    static int getSumPrime(int n) {
        int sum = 0;
        for(int i = 2; i <= n; i++)
            if(isPrime(i) && hasThree(i))
                sum += i;
        return sum;
    }

    static boolean isPrime(int x) {
        for(int i = 2; i < x; i++)
            if(x % i == 0)
                return false;
        return true;
    }

    static boolean hasThree(int x) {
        while (x > 0) {
            if(x % 10 == 3)
                return true;
            x = x / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scnr.nextInt();
        System.out.println("The sum between 0 and " + number + " is: " + getSumPrime(number));
    }
}
