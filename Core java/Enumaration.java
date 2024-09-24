enum Laptop{
    Mac(2000), Xps(2200),Surface(1500),Thinkpad(1800);

    private int price;

    private Laptop(int price){
        this.price= price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enumaration {
    public static void main(String[] args) {
        // Laptop lap= Laptop.Mac;
        // System.out.println(lap+ " : "+ lap.getPrice());
        for (Laptop lap: Laptop.values()){
            System.out.println(lap+ " : "+ lap.getPrice());
        }
    }
}
