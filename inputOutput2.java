import java.util.Scanner;
//scanner class
public class inputOutput2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an Sentence: ");
        String sentence=sc.nextLine();
        System.out.println("Entered Sentence: "+sentence);

        //Reading an integer
        System.out.println("Enter an integer: ");
        int x=Integer.parseInt(sc.nextLine());
        System.out.println("Entered Integer: "+x);

        //Reading a float value
        System.out.println("Enter a float value: ");
        float f=Float.parseFloat(sc.nextLine());
        System.out.println("Entered Float value: "+f);

        sc.close();

    }
}
