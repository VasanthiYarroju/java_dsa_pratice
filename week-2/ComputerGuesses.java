import java.util.Scanner;

public class ComputerGuesses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I'll try to guess it!");

        while (playAgain) {
            int low = 1, high = 100, attempts = 0;
            int response;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                System.out.print("👉 Is it " + mid + "? (1: higher, -1: lower, 0: correct): ");
                response = sc.nextInt();
                attempts++;

                if (response == 0) {
                    System.out.println("🎉 I guessed your number in " + attempts + " attempts!");
                    break;
                } else if (response == 1) {
                    low = mid + 1;
                } else if (response == -1) {
                    high = mid - 1;
                } else {
                    System.out.println("❌ Please enter only 1, -1, or 0.");
                    attempts--; // Don't count invalid input
                }
            }

            System.out.print("🔁 Do you want to play again? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String answer = sc.nextLine().trim().toLowerCase();
            playAgain = answer.equals("yes") || answer.equals("y");
        }

        System.out.println("👋 Thanks for playing!");
        sc.close();
    }
}
