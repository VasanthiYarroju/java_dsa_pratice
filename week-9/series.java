public class series {
    public static void main(String[] args)
     {
        int[] n = {2,4,6,8,10};
        if(isArithmetic(n)) {
            System.out.println("The series is Arithmetic");
            System.out.println("the next term is: " + (n[n.length-1] + (n[1]-n[0])));
        } else if(isGeometric(n)) {
            System.out.println("The series is Geometric");
            System.out.println("the next term is: " + (n[n.length-1] * (n[1]/n[0])));
        } else if(isFibonacci(n)) {
            System.out.println("The series is Fibonacci");
            System.out.println("the next term is: " + (n[n.length-1] + n[n.length-2]));
        }
        else {
            System.out.println("The series is neither Arithmetic nor Geometric nor Fibonacci");
            System.out.println("999");
        }
    }

    public static boolean isArithmetic(int[] n){
        int diff = n[1] -n[0];
        for(int i=2; i<n.length; i++){
            if(n[i] - n[i-1] != diff){
                return false;
            }
        }
        return true;
    }

    public static boolean isGeometric(int[] n){
        if(n[0] == 0) return false; 
        int ratio = n[1] / n[0];
        for(int i=2; i<n.length; i++){
            if(n[i] / n[i-1] != ratio){
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonacci(int[] n){
        for(int i=2; i<n.length; i++){
            if(n[i] != n[i-1] + n[i-2]){
                return false;
            }
        }
        return true;
    }
}
