
public class Calculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int a = 2;
        int b = 3;

        int sum = calc.add(a, b);
        int product = calc.multiply(a, b);

        System.out.println("Calculator Demo");
        System.out.println("------------------");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}