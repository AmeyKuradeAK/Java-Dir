package stdnames;

import java.util.*;

public class StdNames {
    public static void main(String[] args) {
        // Username and Password stored in Arrays as user and pass
        String[] user = { "AmeyKuradeAK", "Codec-Headec", "Apple" };
        String[] pass = { "Amey1234", "Codec1234", "Apple1234" };

        Scanner sc = new Scanner(System.in);

        // First print where we are taking input as b
        System.out.println("Enter Username");
        String b = sc.nextLine();

        // Taking all objects from array "user"
        boolean username = false;
        for (String s : user) {
            if (s.equals(b)) {
                username = true;
                break;
            }
        }

        // Second print where we are taking input as c
        System.out.println("Enter password:");
        String c = sc.nextLine();

        // Taking all objects from array "pass"
        boolean password = false;
        for (String q : pass) {
            if (q.equals(c)) {
                password = true;
                break;
            }
        }

        // Finding both input as valid or not by using if-else statement and printing
        // like below
        if (username && password) {
            System.out.println("\nYou are welcome\n");
            System.out.println("Enter 2 numbers");
            int a, d, sum;
            a = sc.nextInt();
            d = sc.nextInt();

            sum = a + d;

            System.out.println("Addition is: " + sum);
        } else
            System.out.println("You can't access or re-check Username and Password");

    }
}
