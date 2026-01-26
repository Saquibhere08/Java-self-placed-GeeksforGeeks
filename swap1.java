public class swap1{
    public static void main(String[] args) {
        int x=100;
        int y=200;

        System.out.println("Before Swapping");
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        //swapping using 3 variables
        int temp=x;
        x=y;
        y=temp;

        System.out.println("After Swap");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
    }
}