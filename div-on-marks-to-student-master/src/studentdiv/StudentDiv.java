package studentdiv;
import java.util.*;

public class StudentDiv{
    public static void main(String[] args) {
        int m1, m2, m3, per;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Marks of sub 1:");
        m1 = sc.nextInt();
        System.out.println("Marks of sub 1:");
        m2 = sc.nextInt();
        System.out.println("Marks of sub 1:");
        m3 = sc.nextInt();

        per = (m1 + m2 + m3) * 100 / 300;

        if (per >= 60)
        {
            System.out.println("First Division");
        }
        if ((per >= 50) && (per <=59))
        {
            System.out.println("Second Division");
        }
        if ((per >= 40) && (per <= 49))
        {
            System.out.println("Third Division");
        }
        if (per < 40)
        {
            System.out.println("Fail");
        }
    }
}