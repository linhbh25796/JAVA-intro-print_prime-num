import java.util.Scanner;

public class PrimeNumber {


    /**
     * funtion check prime number
     *
     * @param n
     * @return  true : is prime
     *          false: is not prime
     */
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }


}
