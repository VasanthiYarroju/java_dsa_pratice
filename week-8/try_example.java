public class try_example {
    public static void main(String[] args) {
        int n=0;
        try{
            int result=10/n;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        finally{
            System.out.println("Execution completed for the division operation.");
        }
    }
}
