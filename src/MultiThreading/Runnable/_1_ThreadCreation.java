package MultiThreading.Runnable;

class A implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.println(" A  = : "+i);
        }
        System.out.println("Exit A");
    }

}
class B implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.println(" B  = : "+i);
        }
        System.out.println("Exit B");
    }

}

public class _1_ThreadCreation {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        Thread t1 = new Thread(objA,"A thread");
        Thread t2 = new Thread(objB,"B thread");

        t1.start();
        t2.start();
        System.out.println("t1 name = "+t1.getName()+" and t2 name = "+t2.getName());
    }
}
