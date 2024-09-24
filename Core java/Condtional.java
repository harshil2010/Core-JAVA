public class Condtional {
    public static void main(String[] args) {
        // int x= 8;
        // if(x>6 && x<10){
        //     System.out.println("Hello");
        //     System.out.println("Thank You!");
        // }
        // else
        //     System.out.println("Bye");

        int x= 5000;
        int y= 7000;
        int z= 1000;

        if(x>y && x>z)
        System.out.println("x is maximum");
        else if(y>x && y>z)
        System.out.println("y is maximum");
        else
        System.out.println("z is maximum");
    }
}
