public class Str {
    public static void main(String[] args) {
        // String name = "Harshil" //its like a object

        //original way

        String name= new String("Naveen");

        name= name+ " Reddey";

        System.out.println("Hello "+ name);
        System.out.println(name.hashCode());

        String s1= "Harshil";
        String s2= "Naveen";

        System.out.println();
    }
}
