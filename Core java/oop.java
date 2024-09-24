class Caluculator{

    int num=5;
    public int add(int n1, int n2, int n3){
        // System.out.println("in add");
        return n1+n2+n3;
    }

    public int add(int n1, int n2){
        return n1+n2;
    }
}


public class oop {
    int data= 8;
    public static void main(String[] args) {
       
        Caluculator obj= new Caluculator();
        Caluculator obj1= new Caluculator();
        // int result= obj.add(4,5,6);
        obj.num= 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
