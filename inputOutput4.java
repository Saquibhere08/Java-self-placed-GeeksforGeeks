import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputOutput4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an Integer: ");
        int x=Integer.parseInt(br.readLine());
        System.out.println("You Entered: "+x);

    }
}
