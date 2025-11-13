import java.util.*;
public class Alternate_Series {
    public static void main(String[] args){
        int[] list={3,5,1,5,9,10,2,6};//1,2,3,5,5,6,9,10
        Arrays.sort(list);
        int n=list.length;
        int index=0;
        for (int i : list) {
            if(index%2==0){
                System.out.print(i+" ");
            }
            index++;
        }
        //for(int i=0;i<n;i+=2){
            //System.out.print(list[i]+" ");

        //}

    }
}
