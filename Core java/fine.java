import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fine {
   public static void main(String[] args) throws NumberFormatException, IOException{
    int num=0;
    BufferedReader br= null;
    try{
        InputStreamReader in= new InputStreamReader(System.in);
        br= new BufferedReader(in);
        num= Integer.parseInt(br.readLine());
        System.out.println(num);
      
    }
    catch(Exception e){
        System.out.println("Something Went Wrong");
        System.out.println("Bye");
    }

    finally{
        br.close();
        System.out.println("HK");
    }
   }
}
