import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number");
        // int num=  System.in.read();

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        int num=  Integer.parseInt(bf.readLine());

        Scanner sc= new S; 
        System.out.println(num-48);

        bf.close();
    }
}
