

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Given number is Even : " + num);
        } else {
            System.out.println("Given number is Odd : " + num);
        }
    }
}
