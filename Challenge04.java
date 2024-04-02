import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        try {
            String pathNameOfFile;
            pathNameOfFile = JOptionPane.showInputDialog("Please enter the pathname of the file: ");
            FileReader userFile = new FileReader(pathNameOfFile);
            String user_letter = JOptionPane.showInputDialog("Please enter the character you would like me to count from this file: ");
            char user_char = user_letter.charAt(0);
            int counter = 0;
            Scanner scanFile = new Scanner(userFile);
            String strFile = scanFile.nextLine();
            for (int num = 0; num < strFile.length(); num++) {
                char ch = strFile.charAt(num);
                if (ch == user_char) {
                    counter ++;
                }
            }

            JOptionPane.showMessageDialog(null, "The character '" + user_letter + "' appears " + counter + " times.");

            scanFile.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    System.exit(0);
    }
}

