public class Except {
    public static void main(String[] args) {

        int i= 20;
        int j= 0;
        // String s= null;
        // int nums[]= new int[5];
        try
        {
        j= 18/i;
        if(j==0)
            throw new ArithmeticException("I dont want to print the zero");
        // System.out.println(nums[4]);
        // System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            j= 18/1;
            // System.out.println("Something Went Wrong" + e);
        }

        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Mark the limits");
        // }

        catch(Exception e){
            System.out.println("Something went not good"+ e);
        }

        System.out.println(j);
        System.out.println("Bye!!");
    }
}
