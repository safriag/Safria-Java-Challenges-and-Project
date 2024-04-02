import javax.swing.JOptionPane; //For the JOptionPane class
import java.util.*;             //For the util classes

/**
    This program simulates a rock, paper, & scissors game.
 */

public class Challenge05 {
    //Create Random object
    static Random ranNum = new Random();
    //Get a random integer in the range 1-3 and assign it to botNum.
    static int botNum = ranNum.nextInt(3)+1; // 1 = rock, 2 = paper, 3 = scissors

    public static void main(String[] args)
    {

        String user_input = JOptionPane.showInputDialog("Let's play Rock, Paper, & Scissors!\n Rock, Paper, or Scissors: ");
        if (user_input.equalsIgnoreCase("rock")) {
            Rock(botNum); //Call Rock if user inputs "rock" and passing the value in botNum as an argument.
        }
        else if (user_input.equalsIgnoreCase("paper")) {
            Paper(botNum); //Call Paper if user inputs "paper" and passing the value in botNum as an argument.
        }
        else {
            Scissors(botNum); //Call Scissors if user inputs "scissors" and passing the value in botNum as an argument.
        }

        System.exit(0);
    }

    /**
        The Rock method represents the users input as "rock" and displays the result of the winner based on the computer's choice.
        @param num Random number represents computer's choice.
    */
    public static void Rock(int num) {
        if (num == 1) {
            JOptionPane.showMessageDialog(null, "I chose rock!\n It's a tie! We must play again.");
            //This round is a tie, call Replay to play again.
            Replay();
        }
        else if (num == 2) {
            JOptionPane.showMessageDialog(null, "I chose paper! \n I won this round!"); //User lost the round.
        }
        else {
            JOptionPane.showMessageDialog(null, "I chose scissors!\n You won this round!"); //User won the round.
        }

    }
    /**
        The Paper method represents the users input as "paper" and displays the result of the winner based on the computer's choice.
        @param num Random number represents computer's choice.
    */
    public static void Paper(int num) {
        if (num == 1) {
            JOptionPane.showMessageDialog(null, "I chose rock!\n You won this round!"); //User won the round.
        }
        else if (num == 2) {
            JOptionPane.showMessageDialog(null, "I chose paper! \n It's a tie! We must play again.");
            //This round is a tie, call Replay to play again.
            Replay();
        }
        else {
            JOptionPane.showMessageDialog(null, "I chose scissors!\n I won this round!"); //User lost the round.
        }
    }
    /**
        The Scissors method represents the users input as "paper" and displays the result of the winner based on the computer's choice.
        @param num Random number represents computer's choice.
    */
    public static void Scissors(int num) {
        if (num == 1) {
            JOptionPane.showMessageDialog(null, "I chose rock!\n I won this round!"); //User lost the round.
        }
        else if (num == 2) {
            JOptionPane.showMessageDialog(null, "I chose paper! \n You won this round!"); //User won the round.
        }
        else {
            JOptionPane.showMessageDialog(null, "I chose scissors!\n It's a tie! We must play again.");
            //This round is a tie, call Replay to play again.
            Replay();
        }
    }
    /**
        The Replay method will have the user play again if the previous play resulted in a tie.
    */
    public static void Replay() {
        //Get a random integer in the range 1-3 and assign it to newNum.
        int newNum = ranNum.nextInt(3)+1; // 1 = rock, 2 = paper, 3 = scissors

        String user_input = JOptionPane.showInputDialog("Rock, Paper, or Scissors: ");
        if (user_input.equalsIgnoreCase("rock")) {
            Rock(newNum); //Call Rock if user inputs "rock" and passing the value in newNum as an argument.
        }
        else if (user_input.equalsIgnoreCase("paper")) {
            Paper(newNum); //Call Paper if user inputs "paper" and passing the value in newNum as an argument.
        }
        else {
            Scissors(newNum); //Call Scissors if user inputs "scissors" and passing the value in newNum as an argument.
        }
    }
}
