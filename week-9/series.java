public class series {
    public static void main(String[] args)
     {
        int[] n = {1,4,16};
        if(isArithmetic(n)) {
            System.out.println("The series is Arithmetic");
        } else if(isGeometric(n)) {
            System.out.println("The series is Geometric");
        } else if(isFibonacci(n)) {
            System.out.println("The series is Fibonacci");
        }
        else {
            System.out.println("The series is none of the above");
        }
    }

    public static boolean isArithmetic(int[] n){
        int diff = n[1] - n[0];
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
