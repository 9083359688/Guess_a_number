import java.util.Scanner;
import java.util.Random;
public class NumberGussing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String play="yes";

        //We are going to play again
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randNum= rand.nextInt(100);
            int guess=-1;
            int tries=0;
            //check game is over
            while(guess!=randNum)
            {
                System.out.println("Guess a number between 1 to 100");
                guess=sc.nextInt();
                tries++;
                if(guess==randNum)
                {
                    System.out.println("Awesome! you guessed the number!");
                    System.out.println("it only took you "+tries+" guesses!");
                    System.out.println("Would you like to play again? Yes or No");
                    play=sc.next().toLowerCase();
                }
                else if(guess>randNum)
                {
                    System.out.println("Your guess is higher than the random number, please try again");
                }
                else
                {
                    System.out.println("Your guess is lower than the random number, please try again!");
                }

            }

        }
        System.out.println("Thank you for playing!");
        sc.close();
    }
}
