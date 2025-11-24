import java.util.*;

public class exception_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        try{
            System.out.println("Enter a:");
            int a=sc.nextInt();
            System.out.println("Enter b:");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Value of c is:"+c);

        }
        catch(ArithmeticException e){
            System.out.println("Error message:"+e.getMessage());
        }
        
        catch(InputMismatchException e){
            System.out.println("Mismatch error message:"+e.getMessage());
        }

        
        finally{
            System.out.println("Program finished");
        }
    }
}
