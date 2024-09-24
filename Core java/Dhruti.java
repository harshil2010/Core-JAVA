class A
{
    public void show()
    {
        System.out.println("show in A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("show in B");
    }

}


public class Dhruti {
    public static void main(String[] args) {
        A obj= new A();
        obj.show();
    }
}
