public class ThreadMain{
    public static void main(String[] args){
        MyThread t1=new MyThread("T1",Thread.MIN_PRIORITY);
        MyThread t2=new MyThread("T2",Thread.MAX_PRIORITY);
        //MyThread t3=new MyThread("T3");

        t1.start();
        t2.start();
        //t3.start();
        //t1.join();
        System.out.println("Main thread resumes after" + t1.getName());

    }

}