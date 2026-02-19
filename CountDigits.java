import java.util.Scanner;

public class CountDigits {
    public int countDigits(int n) {
        if (n == 0) return 1;
     n = Math.abs(n);
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        CountDigits obj = new CountDigits();
        int result = obj.countDigits(number);

        System.out.println("Total digits: " + result);
    }
}
