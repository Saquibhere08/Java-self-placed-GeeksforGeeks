package GeeksforGeeks;

class Point{
    int x;
    int y; //created memory allocations
}
public class nonPrimitives {
    public static void main(String[] args) {
        Point p=new Point();
        p.x=10; //only references not allocate memory
        p.y=20;
        System.out.println(p.x+ " "+ p.y);
    }
    
}
