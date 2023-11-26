package MultiThreading.ExtendecThreadClass;

public class _4_getNameAndPriority {

    public static void main(String[] args) {

        A tA = new A();
        B tB = new B();
        C tC = new C();

        tA.setPriority(8);
        tB.setPriority(2);
        tC.setPriority(4);

        System.out.println(tA.getPriority());
        System.out.println(tB.getPriority());
        System.out.println(tC.getPriority());

        System.out.println(tA.getName());
        System.out.println(tB.getName());
        System.out.println(tC.getName());


    }
}
