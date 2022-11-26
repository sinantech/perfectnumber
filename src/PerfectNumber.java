import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int number = inp.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + "is a perfect number");
        } else {
            System.out.println(number + "in not a perfect number");
        }
    }
}
