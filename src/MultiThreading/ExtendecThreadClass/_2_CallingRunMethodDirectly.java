package MultiThreading.ExtendecThreadClass;

import MultiThreading.ExtendecThreadClass.A;
import MultiThreading.ExtendecThreadClass.B;
import MultiThreading.ExtendecThreadClass.C;

/*
-------------------------------------------------
Compare the output of _1 and _2 you will notice that the modified program does
not depict multithreading programming behavior and run sequentially instead.
Reason behind is that: each thread run in a separate callstack.


Reason :

Since the direct call to the run() method from main does not create a
separate call stack, its instructions are executed sequentially and not
parallel. Thus calling the run() method directly causes the program to
behave like normal single threaded program.

*/
public class _2_CallingRunMethodDirectly {
    public static void main(String[] args) {
        new A().run();
        new B().run();
        new C().run();
    }
}