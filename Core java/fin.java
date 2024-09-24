class Calc{
    public final void show(){
        System.out.println("In Calc Show");
    }

    public void add(int a, int b){
        System.out.println(+b);
    }
}

class AdvCalc extends Calc{
    public void show1(){
        System.out.println("I am HK");
    }
}

public class fin {
    public static void main(String[] args) {
    //    final  int num = 8;
        AdvCalc obj= new AdvCalc();
        obj.show();
        obj.add(4,5);
    //     System.out.println(num);
    }
}
