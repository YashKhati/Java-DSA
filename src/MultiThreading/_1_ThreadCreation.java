package MultiThreading;

/*
-----------------------------------------
Thread Creation  -:
    Extending Thread Class
    Implementing Runnable Interface
-----------------------------------------

This Program We will create Thread Using Extending Thread Class

How to create thread -:
Threads are implemented in the form of objects that contain a method run( ).
The run( ) method is the heart and soul of any thread.
It makes up the entire body of a thread and is the only method in which the
thread‟s behavior can be implemented.
The run( ) method should be invoked by an object of the concerned thread.
Thus  can be achieved by creating the thread and initiating it with the help
of another thread method called start( )


 */


class A extends  Thread
{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t From thread A : i = " + i);
        }
        System.out.println("Exit A");
    }
}
class B extends  Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t From thread B : i = " + i);
        }
        System.out.println("Exit B");
    }
}
class C extends  Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("\t From thread C : i = " + i);
        }
        System.out.println("Exit C");
    }
}
public class _1_ThreadCreation{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.start();
        objB.start();
        objC.start();
    }
}
