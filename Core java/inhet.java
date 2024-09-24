class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }

   
}

class AdvCalc extends Calc{

    public double div(int n1, int n2){
        return n1/n2;
    }

    public int mul(int n1, int n2){
        return n1*n2;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}
public class inhet {
    public static void main(String[] args) {
        VeryAdvCalc a1= new VeryAdvCalc();
        int r1= a1.add(5, 4);
        int r2= a1.sub(5, 4);
        double r3= a1.div(5, 4);
        int r4= a1.mul(5, 4);
        double r5 =  a1.power(5,4);

        System.out.println(r1 + " "+ r2 + " "+ r3 + " "+ r4 + " "+ r5);
    }
}
