import java.io.*;
import java.util.*;
public class swap5 { //user input
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();

        System.out.println("Before swap!");
        System.out.println("a = "+a);
        System.out.println("b= "+b);

        //code to swap

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap!");
        System.out.println("a = "+a);
        System.out.println("b= "+b);

    }
}
