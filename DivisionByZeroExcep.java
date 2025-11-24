class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionByZeroExcep {

    static class ZeroException{
        public void checkDivision() {
            try{
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("Input a:");
                int a = sc.nextInt();
                System.out.println("Input b:");
                int b = sc.nextInt();
                if(b==0){
                    throw new DivisionByZeroException("Division by zero");
                }
                int c = a / b;
                
            }
            // catch(Exception e){
            //     System.out.println(e);
            // }

            catch(DivisionByZeroException e){
                System.out.println("Division by zero");
            }
        }
    }

    public static void main(String[] args) {
        ZeroException ze = new ZeroException();
        ze.checkDivision();
    }
}