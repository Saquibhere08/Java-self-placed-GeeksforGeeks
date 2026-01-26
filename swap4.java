public class swap4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Before swapping, a = "+a +"and b = "+b);

        //swapping a and b using XOR
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("after swapping, a = "+a +"and b = "+b);
    }
}
