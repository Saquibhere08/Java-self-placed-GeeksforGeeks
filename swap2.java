public class swap2 {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        System.out.println("Before swapping, a= "+a +"and b = "+b);
//swapping using 2 variables
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping, a = "+a + "and b = "+b);
    }
    
}
