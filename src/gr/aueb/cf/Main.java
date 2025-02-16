package gr.aueb.cf;

public class Main {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        int result;

        result = add(num1, num2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error. Denominator must not be zero.");
            throw e;
        }
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
