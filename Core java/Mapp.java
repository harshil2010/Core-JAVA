import java.util.Map;
import java.util.HashMap;
public class Mapp {
   public static void main(String[] args) {
    Map<String, Integer> students= new HashMap<String, Integer>();
    students.put("Harshil", 1);
    students.put("VIshva", 2);
    students.put("Shyam", 5);
    students.put("Vihar", 3);
    students.put("Kirtan", 4);
    students.put("Shyam", 6);



    System.out.println(students);
    // System.out.println(students.get("Harshil"));
    System.out.println(students.keySet());


   }
}
