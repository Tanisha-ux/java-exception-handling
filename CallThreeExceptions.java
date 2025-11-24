class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class CallThreeExceptions {

    static class CallExceptions {

        static void checkDivision() {
            try {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("Input a:");
                int a = sc.nextInt();
                System.out.println("Input b:");
                int b = sc.nextInt();
                if (b == 0) {
                    throw new DivisionByZeroException("Error:Division by zero!");
                }
                int c = a / b;

            } catch (DivisionByZeroException e) {
                System.out.println(e);
            }
        }

        static void checkArithmetic() {
            try {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int x = sc.nextInt();   // error if char input
                int y = x / 4;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }

        static void checkforArray() {
            int arr[] = {1, 2, 3, 4};
            try {
                System.out.println(arr[-1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        CallExceptions.checkDivision();
        CallExceptions.checkArithmetic();
        CallExceptions.checkforArray();
    }
}
