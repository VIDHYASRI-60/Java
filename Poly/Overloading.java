public class Overloading {

    int Calc(int a, int b) {
        return a + b;
    }

    int Calc(int a, int b, char op) {
        return a - b;
    }

    int Calc(int a, int b, int c) {
        return a * b;
    }

    int Calc(int a, int b, char op1, char op2) {
        return a / b;
    } 

    int Calc(int a, int b, boolean isMod) {
        return a % b;
    }

    public static void main(String[] args) {

        Overloading c = new Overloading();

        System.out.println("Addition: " + c.Calc(2, 3));
        System.out.println("Difference: " + c.Calc(5, 2, '-'));
        System.out.println("Product: " + c.Calc(2, 3, 1));
        System.out.println("Quotient: " + c.Calc(15, 3, '/', '/'));
        System.out.println("Remainder: " + c.Calc(15, 4, true));
    }
}
