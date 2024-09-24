class Human
{
    private int age;
    private String name;

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

public class encapsulation {
    public static void main(String[] args) {
        Human h1= new Human();
        h1.setAge(30);
        h1.setName("Harshil Kathiriya");
        System.out.println(h1.getAge() + " : " + h1.getName());
    }
}
