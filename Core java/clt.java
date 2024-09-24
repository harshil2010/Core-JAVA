class Laptop{
    String model;
    int price;
    // Object class 
    public String toString(){
        return model + " : " + price;
    }
}

public class clt{
    public static void main(String[] args) {
        
        Laptop obj = new Laptop();
        obj.model= "Lenova Yoga";
        obj.price= 1000;

        System.out.println(obj.toString());
    }
}
