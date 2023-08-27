package Switch;

import java.util.*;

public class Switch {
    public void loop() {
        int a, b, c;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Choose any option from below");
        System.out.println("1. Addition   "+"2. Subtraction    "+"3. Multiplication    "+"4. Division");



        int op = 4;
        op = sc.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("Enter 1st number:");
                a = sc.nextInt();
                System.out.println("Enter 2nd number:");
                b = sc.nextInt();
                c = a + b;
                System.out.println("Required answer is :" + c);
            }
            case 2 -> {
                System.out.println("Enter 1st number:");
                a = sc.nextInt();
                System.out.println("Enter 2nd number:");
                b = sc.nextInt();
                c = a - b;
                System.out.println("Required answer is :" + c);
            }
            case 3 -> {
                System.out.println("Enter 1st number:");
                a = sc.nextInt();
                System.out.println("Enter 2nd number:");
                b = sc.nextInt();
                c = a * b;
                System.out.println("Required answer is :" + c);
            }
            case 4 -> {
                System.out.println("Enter 1st number:");
                a = sc.nextInt();
                System.out.println("Enter 2nd number:");
                b = sc.nextInt();
                c = a / b;
                System.out.println("Required answer is :" + c);
            }
            default -> System.out.println("Your Input is wrong");
        }


    }
}
