import java.util.Scanner;

public class ComputerGuesses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int response = -1;

        System.out.println("🤖 Think of a number between 1 and 100.");
        System.out.println("I will try to guess it! Respond with:");
        System.out.println("1  →  My number is higher");
        System.out.println("-1 →  My number is lower");
        System.out.println("0  →  Correct!");

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.print("👉 Is it " + mid + "? Your response: ");
            response = sc.nextInt();

            if (response == 0) {
                System.out.println("🎉 Yay! I guessed your number: " + mid);
                break;
            } else if (response == 1) {
                low = mid + 1;
            } else if (response == -1) {
                high = mid - 1;
            } else {
                System.out.println("❌ Invalid response. Please enter 1, -1, or 0.");
            }
        }

        if (low > high) {
            System.out.println("😓 Hmm... Are you sure you answered correctly?");
        }

        sc.close();
    }
}
