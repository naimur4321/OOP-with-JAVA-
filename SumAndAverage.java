import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextInt();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / 5.0));
        scanner.close();
    }
}
