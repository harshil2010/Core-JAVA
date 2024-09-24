abstract class Car{
    public  abstract void drive();

    public void playMusic(){
        System.out.println("Play Music!!");
    }
}

class Wagon extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}
public class Abs {
    public static void main(String[] args) {
        Car obj= new Wagon();
        obj.drive();
        obj.playMusic();
    }
}
