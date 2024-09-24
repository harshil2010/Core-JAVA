class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name= "phone";
        System.out.println("In static block");
    }

    //constructor
    public Mobile(){
        brand= "";
        price= 2000;
        name="Phone";
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(price + " : "+ brand+ " : " + name);
    }
}

public class statmethod {
    public static void main(String[] args) {

        // Class.forName(className: "Mobile");

        // Mobile obj1= new Mobile();
        // obj1.brand= "apple";
        // obj1.price= 1500;
        // Mobile.name= "Smart Phone";

        // Mobile obj2= new Mobile();

        // obj1.show();
        // obj2.show();


    }
}
