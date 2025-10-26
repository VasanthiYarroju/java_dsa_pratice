import java.util.*;
import java.lang.*;
import java.io.*;

public class first_occurance_string {
    public static void main(String[] args) {
        String str = "hello world, welcome to the world of java";
        String target = "world";

        int index = firstOccurrence(str, target);

        if (index != -1) {
            System.out.println("First occurrence of '" + target + "' is at index: " + index);
        } else {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }

    public static int firstOccurrence(String str, String  target) {
        int n=str.length();
        int m=target.length();
        for(int i=0;i<=n-m;i++){
            if(str.substring(i,i+m).equals(target)){
                return i;
            }
        }
        return -1; 
    }
}
