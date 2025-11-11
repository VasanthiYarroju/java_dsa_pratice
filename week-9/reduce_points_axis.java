import java.util.*;
public class reduce_points_axis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] points=new int[n][2];
        for(int i=0;i<n;i++){
            points[i][0]=sc.nextInt();
            points[i][1]=sc.nextInt();
        }
        System.out.println(reducePoints(points,n));
    }
    public static int reducePoints(int[][] points,int n){
        int count=0;
        int lastpoint=Integer.MIN_VALUE;
        Arrays.sort(points, (a,b) -> a[1]-b[1]);
        for(int i=0;i<n;i++){
            int start=points[i][0];
            int end=points[i][1];
            if(start>lastpoint){
                count++;
                lastpoint=end;
            }
        }
        return count;
    }
}
