class A{
    public A(){

        super();
        System.out.println("In A");
    }
    
    public A(int n){
        System.out.println("A is int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        this();
        System.out.println("B is int");
    }
}

public class keyw {
    public static void main(String[] args) {
        B obj= new B(5);

    }
}
