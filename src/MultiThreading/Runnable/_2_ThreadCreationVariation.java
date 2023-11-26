package MultiThreading.Runnable;

class createThread implements  Runnable{
    Thread thr;

    createThread(String name){
        thr = new Thread(this,name);
    }
    public  static  createThread createAndStart(String name)
    {
        createThread myThread = new createThread(name);

        myThread.thr.start();
        return  myThread;
    }

    @Override
    public void run() {
        System.out.println(thr.getName() +" Starting");
        try {
            for(int i=0 ; i<=20; i++){
                Thread.sleep(400);
                System.out.println("In "+thr.getName()+" count is "+i);
            }
        }
        catch (InterruptedException iEp){
            System.out.println(thr.getName()+" Interrupted" );
        }
        System.out.println(thr.getName()+ " Terminating");
    }
}
public class _2_ThreadCreationVariation
{
    public static void main(String[] args) {

        System.out.println("Starting Main : ");
        createThread t1 = createThread.createAndStart("Child A ");
        for(int i=0; i<20; i++){
            System.out.println(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException iEp){
                System.out.println("Main thread Interrupted");

            }
        }

        System.out.println("Main End");
    }
}
