import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Challenge06 extends JPanel{
    private double radius;
    public Challenge06(double radius) {
        this.radius = radius;
    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        int diameter = (int)(2*radius);
        int x = getWidth()/2;
        int y = getHeight()/2;
        g.drawOval(x,y,diameter,diameter);
    }
    public static void main(String[] args) {
        //Ask for user's input
        double user_input = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius of the circle."));
        //Create a Circle object and assign its address to the userCircle variable.
        Circle userCircle = new Circle(user_input);
        //Display details based off circle's radius.
        JOptionPane.showMessageDialog(null, "You have inputted the radius as: " + user_input +
                ".\n The area of the circle is: " + userCircle.getArea() + ".\n The diameter of the circle is: " +
                userCircle.getDiameter() + ".\n The circumference of the circle is: " + userCircle.getCircumference() + ".");

        JFrame window1 = new JFrame("Circle");
        window1.setLocation(500,400);
        window1.setSize(400,400);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.add(new Challenge06(user_input));
        window1.setVisible(true);
    }

}

/**
 * The Circle class holds data about a circle.
 */
class Circle {
    private double radius;
    private final double PI = 3.14159;

    /**
     * Constructor
     * @param userRadius The radius of the circle.
     */
    public Circle(double userRadius) {
        radius = userRadius;
    }

    /**
     * The setRadius method stores a value in the radius field.
     * @param newRadius The value to store in radius.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /**
     * The getRadius method returns a Circle object's radius.
     * @return The value in the radius field.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * The getArea method returns a Circle object's area.
     * @return The product of pi times radius^2(squared).
     */
    public double getArea() {
        return PI*radius*radius;
    }

    /**
     * The getDiameter method returns a Circle object's diameter.
     * @return The product of radius times two.
     */
    public double getDiameter() {
        return radius * 2;
    }

    /**
     * The getCircumference method returns a Circle object's circumference.
     * @return The product of two times pi times radius.
     */
    public double getCircumference() {
        return 2*PI*radius;
    }

}