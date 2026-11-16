import java.util.Scanner;

public class FPairs {

    static int sumOfDivisors(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int sum1 = sumOfDivisors(n1);
        int sum2 = sumOfDivisors(n2);

        if (sum1 * n2 == sum2 * n1) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not a Friendly Pair");
        }

        sc.close();
    }

}
