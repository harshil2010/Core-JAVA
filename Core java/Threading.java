// class A implements Runnable{
//     public void run(){
//         for(int i=0; i<=10; i++){
//         System.out.println("Hi");
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) { e.printStackTrace();}
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0; i<=10; i++){
//         System.out.println("Hello");
//         }
//     }
// }

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class Threading {
    public static void main(String[] args) throws InterruptedException {

        Counter c= new Counter();
        Runnable obj1= () ->
        {
            for(int i=0; i<=100; i++)
            {
                    c.increment();
            }
         };
        Runnable obj2= () ->
        {
            for(int i=0; i<=100; i++)
            {
                    c.increment();
            }
         };
        // System.out.println(obj1.getPriority());
       Thread t1= new Thread(obj1);
       Thread t2= new Thread(obj2);

       t1.start();;
       t2.start();

       t1.join();
       t2.join();
       System.out.println(c.count);
       
       // obj1.start();

        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) { e.printStackTrace();}

        // obj2.start();
    }
}
