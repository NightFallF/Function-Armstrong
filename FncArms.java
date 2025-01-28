import java.util.Scanner;

public class FncArms {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter number to check:");
        int number = get.nextInt();
        int temp = number, sum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
