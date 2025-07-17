import java.util.Stack;
public class Celebrity {
    static  int  celebrity(int[][] mat){
        int n=mat.length;
        Stack <Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            s.push(i);
        }
        while(s.size()>1){
            int a=s.pop();
            int b=s.pop();
            if(mat[a][b]!=0){
                s.push(b);
            }
            else{
                s.push(a);
            }
        }
        int c=s.pop();
        for(int i=0;i<n;i++){
            if(i==c)
                continue;
            if(mat[c][i]!=0 || mat[i][c]==0)
            return -1;
        }
        return c;
    }
    public static void main(String[] args){
        int mat[][]= { { 1,0,0 },
                        { 1,0,1 },
                        { 1,1,0 } };
    
        System.out.println(celebrity(mat));
    }
}
