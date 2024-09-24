class A{
    public void show(){
        System.out.println("In A Show");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("In B Show");
//     }
// }

public class Anonum {
    public static void main(String[] args) {
       A obj= new A(){
        public void show(){
            System.out.println("In A new Show");
        }
       };
       obj.show();
    }
}
