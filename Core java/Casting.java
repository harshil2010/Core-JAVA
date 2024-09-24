class A{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show1()
    {
        System.out.println("In B Show");
    }
}

public class Casting {
    public static void main(String[] args) {
        // double d= 4.5;
        // int i = (int) d;
        // A obj = new A();
        A obj = new B();// upcasting

        B obj1=(B) obj;//down casting
        obj1.show1();

        // obj.show();
        // System.out.println(d);
        // System.out.println(i);
    }
}
