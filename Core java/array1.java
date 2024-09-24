class Student{
    int rollno;
    String name;
    int marks;
}

public class array1 {
    public static void main(String[] args) {

        // Student s1= new Student();
        // s1.rollno= 1;
        // s1.name= "Harshil";
        // s1.marks=98;

        // Student s2= new Student();
        // s2.rollno= 2;
        // s2.name= "Rushil";
        // s2.marks=88;

        // Student s3= new Student();
        // s3.rollno= 3;
        // s3.name= "Rahil";
        // s3.marks=78;

        // Student students[]= new Student[3];
        // students[0]= s1;
        // students[1]= s2;
        // students[2]= s3;

        // for(int i=0; i< students.length; i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }


        // int arr[]= new int[6];
        // arr[0]= 1;
        // arr[1]= 5;
        // arr[2]= 12;
        // arr[3]= 18;
        
        // for(int i= 0; i< arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        int arr[]= new int[4];
        arr[0]= 1;
        arr[1]= 5;
        arr[2]= 12;
        arr[3]= 18;

        for(int n: arr){
            System.out.println(n);
        }


    }
}
