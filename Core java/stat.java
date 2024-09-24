class Mobile{
    String brand;
    int price;
    String network;
    String name;

    public void show(){
        System.out.println(price + " : "+ brand+ " : "+ network + " : "+ name);
    }
}
public class stat {
    public static void main(String[] args) {
        Mobile obj1= new Mobile();
        obj1.brand= "apple";
        obj1.price= 1500;
        obj1.network= "5G";
        obj1.name= "Smart Phone";

        Mobile obj2= new Mobile();
        obj2.brand= "Samsuung";
        obj2.price= 1500;
        obj2.network= "5G";
        obj2.name= "Smart Phone";

        obj1.name= "phone";

        obj1.show();
        obj2.show();
    }
}
