public class swap3 {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=20;
        System.out.println("Before swapping, a= "+a +"and b = "+b);

        //swapping a and b using
        //below statement
        b=a+b-(a=b);

        System.out.println("Before swapping, a = "+a +"and b = "+b);
    }
    
}
