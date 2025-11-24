public class MathOperation {

    // method 1 — addition of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // method 2 — multiplication of two doubles
    double calculate(double a, double b) {
        return a * b;
    }

    // method 3 — length of a string
    int calculate(String s) {
        return s.length();
    }



    public static void main(String[] args) {

        MathOperation obj = new MathOperation();

        // calling overloaded methods
        int sum = obj.calculate(10, 20);
        double product = obj.calculate(2.5, 4.0);
        int strLength = obj.calculate("Tanisha");

        // displaying results
        System.out.println("Addition: " + sum);
        System.out.println("Multiplication: " + product);
        System.out.println("String Length: " + strLength);
    }
}

