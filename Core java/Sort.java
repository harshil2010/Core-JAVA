import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        Comparator<Integer> com= new Comparator<Integer>();
        {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                return 1;
                else 
                return -1;
            }
        };
        List<Integer> num= new ArrayList<Integer>();

        num.add(11);
        num.add(52);
        num.add(80);
        num.add(20);

        Collections.sort(num, com);

        System.out.println(num);
    }
}
