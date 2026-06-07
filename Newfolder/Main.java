class First extends Thread {
    public void run() {
        System.out.println("Thread started");
        try { Thread.sleep(500); } catch(Exception e) {}
        System.out.println("Still alive? " + isAlive());
    }
}
public class Main {
    public static void main(String[] args) {

        First t = new First();

        t.setName("MyThread");
        System.out.println("Name: " + t.getName());

        t.setPriority(10);
        System.out.println("Priority: " + t.getPriority());

        t.start();

        try { t.join(); } catch(Exception e) {}

        System.out.println("Main thread: " + Thread.currentThread().getName());

        Thread.yield();

        System.out.println("Alive after join? " + t.isAlive());
    }
}


//Runnable interface

class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread  using Runnable interface...");
    }
}
public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();
    }
}

