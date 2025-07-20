//here i am using not a binary search and asking user to guess a no 
import java.util.*;
public class Guessgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int n=100;
        int pick=rand.nextInt(n)+1;
        int attempts=0;
        while(true){
            System.out.println("enter your guess");
            int guess=sc.nextInt();
            attempts++;
            if(guess==pick){
                System.out.println("you guessed the correct number in "+attempts+" attempts");
                break;
            }
            else if(guess<pick){
                System.out.println("your guess is too low");
            }
            else{
                System.out.println("your guess is too high");
            }
        }
        sc.close();

    }
}
