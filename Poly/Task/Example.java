//Maximun

/*class Example{
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    float max(float a, float b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Max of integers: " + obj.max(10, 20));
        System.out.println("Max of floats: " + obj.max(5.5, 2.3));
    }
}*/

//Displays an integer and a string

class Example {

    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(String s) {
        System.out.println("String value: " + s);
    }

    public static void main(String[] args) {
        Example obj = new Example();

        obj.display(10);
        obj.display("Hello Java");
    }
}
