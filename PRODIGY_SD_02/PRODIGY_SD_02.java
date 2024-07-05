import java.util.*;

public class PRODIGY_SD_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int up =100;
        int compguess = random.nextInt(up);

        int attempts =0;
        int userguess;

        System.out.println("Guess a number between 0 to 100.");
        
        do
        {
            System.out.println("Enter your guess: ");
            userguess = sc.nextInt();
            attempts++;

            if(userguess < compguess)
            {
                System.out.println("The guessed number is too low.");
            }
            else if(userguess > compguess)
            {
                System.out.println("The guessed number is too high.");
            }
            else
            {
                System.out.println("Correctly guessed on attempts no: " + attempts);
            }
        }while(userguess != compguess);
        sc.close();
    }
}