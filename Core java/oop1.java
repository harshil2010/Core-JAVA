class Computer{
   public void PolayMusic()
    {
        System.out.println("Music Playing!!");
    }

    public String getMeAPen(int n)
    {
        if(n>=5)
            return "Pen";
        else
            return "Not valid price for buying pen!";
    }
}

public class oop1 {
    public static void main(String[] args) {
        Computer obj1= new Computer();
        obj1.PolayMusic();
        String str= obj1.getMeAPen(1);
        System.out.println(str);
    }
}
