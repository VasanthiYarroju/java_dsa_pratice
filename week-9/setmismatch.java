public class setmismatch {
    public static int[] finderrornums(int[] nums){
        int n=nums.length;
        int[] count=new int[n+1];
        int duplicate=-1,missing=-1;
        for(int num:nums){
            count[num]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==2){
                duplicate=i;
            }
            else if(count[i]==0){
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
    }
    public static void main(String[] args){
        int[] nums={1,2,2,4};
        System.out.println(finderrornums(nums)[0]+" "+finderrornums(nums)[1]);
    }
}
