
// import java.util.ArrayList;
// import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class collect {
    public static void main(String[] args) {
        // Collection<Integer> num = new ArrayList<Integer>();
        Set<Integer> num= new TreeSet<Integer>();
        num.add(64);
        num.add(55);
        num.add(44);
        num.add(33);
        num.add(22);
        
        for(int n: num){
            System.out.println(n);
        }
        
        
    }
}
