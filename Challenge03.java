import javax.swing.JOptionPane;
public class Challenge03 {
    public static void main(String[] args) {
        String user_input, user_low_match, user_up_match;
        user_input = JOptionPane.showInputDialog("Please enter a character (A-Z, a-z): ");
        user_low_match = user_input.toLowerCase();
        user_up_match = user_input.toUpperCase();
        if (user_input.equals(user_low_match) && !user_input.equals(user_up_match)) {
            JOptionPane.showMessageDialog(null, user_input + " is lowercase");
        }
        else if (user_input.equals(user_up_match) && !user_input.equals(user_low_match)) {
            JOptionPane.showMessageDialog(null, user_input + " is uppercase");
        }
        else {
            JOptionPane.showMessageDialog(null, "Error: I cannot determine the case of a value other than an alphabetical character.");
        }
                System.exit(0);
    }
}


