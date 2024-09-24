
interface A {

    int age= 18;  // final and static by default
    String area= "Mumbai";
    void show();// All method are public & Abstract by default
    void config();
}

interface X {

    void run();
}

interface Y extends X{

}

class B implements A, Y{
    public void show()
    {
        System.out.println("In B show");
    }

    public void config(){
        System.out.println("In B Config");
    }

    public void run(){
        System.out.println("The Running");
    }
}
   

public class Inter {
    public static void main(String[] args) {
        A obj;
        obj= new B();

        obj.show();
        obj.config();

        X obj1= new B();
        obj1.run();
    }
}
