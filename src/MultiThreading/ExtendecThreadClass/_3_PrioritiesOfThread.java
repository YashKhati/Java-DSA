package MultiThreading.ExtendecThreadClass;

import MultiThreading.ExtendecThreadClass.A;
import MultiThreading.ExtendecThreadClass.B;
import MultiThreading.ExtendecThreadClass.C;

/*
    Priorities -> in form of integer Values (1 to 10)

    Thread.MIN_PRIORITY -> Min Priority (1)
    Thread.MAX_PRIORITY -> Max Priority (10)
    Thread.NORM_PRIORITY -> Min Priority (5)

    Methods that are used to set the priority of thread -:
    setPriority()
    getPriority()

*/
public class _3_PrioritiesOfThread
{
    public static void main(String[] args) {
        A ObjA = new A();
        B ObjB = new B();
        C ObjC = new C();

        ObjC.setPriority(Thread.MAX_PRIORITY);
        ObjA.setPriority(Thread.NORM_PRIORITY);
        ObjB.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start A : ");
        ObjA.start();
        System.out.println("Start B : ");
        ObjB.start();
        System.out.println("Start C : ");
        ObjC.start();

        System.out.println("End Main Thread");
    }
}
