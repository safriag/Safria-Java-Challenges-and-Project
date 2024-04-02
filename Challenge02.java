import javax.swing.JOptionPane;

public class Challenge02 {
    public static void main(String[] args) {
        String first_name, last_name, user_name, fav_color;
        int users_age, num_of_people;
        first_name = JOptionPane.showInputDialog("Please enter your first name.");
        last_name = JOptionPane.showInputDialog("Please enter your last name.");
        user_name = first_name + " " + last_name;
        users_age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        num_of_people = 2024 - users_age;
        fav_color = JOptionPane.showInputDialog("What is your favorite color?");

        JOptionPane.showMessageDialog(null, "In 2024, a giant " + fav_color + " spaceship landed on Earth carrying "
                + num_of_people + " people. What's even stranger is that the number of people on board that ship was also the year in which you, "
                + user_name + ", were born!");
        System.exit(0);
    }
}
