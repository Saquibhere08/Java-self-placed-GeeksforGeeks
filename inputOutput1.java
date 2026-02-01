import java.util.Scanner;
//scanner class
public class inputOutput1 {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a=scn.nextInt();

        System.out.print("Enter second Number: ");
        int b=scn.nextInt();

        System.out.println("Sum: "+(a+b));
        scn.close();

    }
}
