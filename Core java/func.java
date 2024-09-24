@FunctionalInterface
interface A{
    int add(int i, int j);

}

public class func {
    public static void main(String[] args) {
            A obj= (int i, int j) -> i+j ;     
            int res=  obj.add(5,6);
            System.out.println(res);
    }  
}

