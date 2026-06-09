package mypackage;
public class Main{
    public static void main(String[] args){
        Student ob =new Student();
        Student ob1=new Student();
        ob.id=5;
        ob.name="John";
        ob1.id=6;
        ob1.name="Max";
        ob1.display();
        ob.display();
    }
}