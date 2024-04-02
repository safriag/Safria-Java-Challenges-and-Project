import javax.swing.JOptionPane;
public class Challenge09 {
    private final String user_input;

    /**
     * Constructor
     * @param user_input The user's password input.
     */
    public Challenge09(String user_input) {
        this.user_input = user_input;
    }

    public static void main(String[] args) {
        String user_input = JOptionPane.showInputDialog("""
                Please enter a password that is at least 8 characters long,
                and has at least one of the following:
                -Uppercase letter
                -Lowercase letter
                -Digit
                -Special Characters: !@#$%^&*""");
        Challenge09 passwordInput = new Challenge09(user_input);
        passwordInput.checkLength(user_input);
        System.exit(0);
    }

    /**
     * checkLength method
     * @param user_input The user's password input.
     * This method checks if the user's password meets the requirement of being at least 8 characters long.
     */
    public void checkLength(String user_input){

        if (user_input.length() < 8){
            JOptionPane.showMessageDialog(null,"Invalid password. Must be at least 8 characters long");
        }
        else {
            hasUppercase(user_input);
        }
    }

    /**
     * hasUppercase method
     * @param user_input The user's password input.
     * This method checks if the user's password meets the requirement of having at least one uppercase character.
     */
    public void hasUppercase(String user_input){
        boolean upperStatus = false;
        char [] passwordArrayU;
        passwordArrayU = user_input.toCharArray();
        for (char c : passwordArrayU){
            if (Character.isUpperCase(c)){
                upperStatus = true;
                break;
            }
        }
        if (upperStatus){
            hasLowercase(user_input);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid password. Must have at least one uppercase character.");
        }
    }

    /**
     * hasLowercase method
     * @param user_input The user's password input.
     * This method checks if the user's password meets the requirement of having at least one lowercase letter.
     */
    public void hasLowercase(String user_input){
        boolean lowerStatus = false;
        char [] passwordArrayL;
        passwordArrayL = user_input.toCharArray();
        for (char c : passwordArrayL){
            if (Character.isLowerCase(c)){
                lowerStatus = true;
                break;
            }
        }
        if (lowerStatus){
            hasDigit(user_input);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid password. Must have at least one lowercase letter.");
        }
    }

    /**
     * hasDigit method
     * @param user_input The user's password input.
     * This method checks if the user's password meets the requirement of having at least one digit.
     */
    public void hasDigit(String user_input){
        boolean digitStatus = false;
        char [] passwordArrayD;
        passwordArrayD = user_input.toCharArray();
        for (char c : passwordArrayD) {
            if (Character.isDigit(c)) {
                digitStatus = true;
                break;
            }
        }
        if (digitStatus){
            hasSpecialChar(user_input);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid password. Must have at least one digit.");
        }
    }

    /**
     * hasSpecialChar method
     * @param user_input The user's password input.
     * This method checks if the user's password meets the requirement of having at least one special character.
     */
    public void hasSpecialChar(String user_input){
        boolean specialCharStatus = false;
        char [] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*'};
        char [] passwordArrayS;
        passwordArrayS = user_input.toCharArray();
        for (char c : passwordArrayS){
            for (char sC: specialCharacters){
                if (c == sC) {
                    specialCharStatus = true;
                    break;
                }
            }
        }
        if (specialCharStatus){
            JOptionPane.showMessageDialog(null,"Your password is valid.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid password. Must include at least one special character.");
        }
    }
}

