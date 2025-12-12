import java.util.HashMap;
public class majority{
    public static int majorityElement(int[] numa){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:numa){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>(numa.length/2)){
                return num;
            }
        }
        return -1;

    }    
    public static void main(String[] args){
        int[] numa={3,2,3};
        System.out.println(majorityElement(numa));
    }
}