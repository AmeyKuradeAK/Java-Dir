package calculator;
import java.util.Scanner;

public class Calculator {
    private static int a, b;
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter any value:");a = sc.nextInt();
        System.out.println("Enter any value:");
        b = sc.nextInt();
        xSum();
        xSub();
        xMul();
        xDiv();
    }
    public static void xSum(){
        int c = a + b;
        System.out.println("Addition is:"+c);
    }
    public static void xSub(){
        int d = a + b;
        System.out.println("Subtraction is:"+d);
    }
    public static void xMul(){
        int e = a + b;
        System.out.println("Multiplication is:"+e);
    }
    public static void xDiv(){
        float f = a + b;
        System.out.println("Division is:"+f);
    }

}