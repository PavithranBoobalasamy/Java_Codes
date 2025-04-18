public class MultiThreadingDemo{
    public static void main(String[] args) {
        Runnable obj = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " Hi");
                try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println(e.getMessage());}
            }
        };
        Runnable obj1 =  ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " Hello");
                try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println(e.getMessage());}
            }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}