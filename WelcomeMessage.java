import javax.swing.JOptionPane;

public class WelcomeMessage {
    public static void main(String[] args) {
        String first_name, last_name;

        first_name = JOptionPane.showInputDialog("Please enter your first name.");
        last_name = JOptionPane.showInputDialog("Please enter your last name.");

        JOptionPane.showMessageDialog(null, "Welcome " + first_name + " " + last_name + "!");
        System.exit(0);
    }
}
