import java.util.Arrays;

public class liking {
    public static void main(String[] args){
        int[] l = {-1, 3, 4};
        System.out.println(maxSatisfaction(l));
    }

    public static int maxSatisfaction(int[] l){
        int n = l.length;
        Arrays.sort(l); 
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            int sum = 0;
            int time = 1;
            for (int j = i; j < n; j++){
                sum += l[j] * time;
                time++;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
