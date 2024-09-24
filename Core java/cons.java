class Human {
    private int age;
    private String name;

    //Default Constructor
    public Human(){

        age= 12;
        name= "Harshil";
        System.out.println("in constructor");
    }
    //parameterized Constructor
    public Human(int a, String n){
        age= a;
        name= n;
    }

    public Human(String n){
        name= n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age= a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name= n;
    }
}

public class cons{
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(20, "parth");
        Human obj2 = new Human("Vihar");
        // obj.setAge(18);
        // obj.setName("Harshil");

        System.out.println(obj.getName()+ " : " + obj.getAge());
        System.out.println(obj1.getName()+ " : " + obj1.getAge());
        System.out.println(obj2.getName()+ " : " + obj2.getAge());
    }
}
