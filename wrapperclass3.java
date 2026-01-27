import java.util.ArrayList;

public class wrapperclass3 {
    public static void main(String[] args) {
        Character ch='a';
        //Unboxing: Character ->char
        char c=ch;
        System.out.println(c);

        //unboxing : Interger -> int
        ArrayList<Integer> list=new ArrayList<>();
        list.add(24);

        int num=list.get(0);

        System.out.println(num);

    }
    
}
