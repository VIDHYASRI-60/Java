public class MyThread extends Thread{
    MyThread(String name,int priority){
        setName(name);
        setPriority(priority);
    }
    public void run(){
        try {
            System.out.println(getName());
            //System.out.println(getName() + "started |Priority :");
            Thread.sleep(5000);
            System.out.println(getName() + "Finished");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}