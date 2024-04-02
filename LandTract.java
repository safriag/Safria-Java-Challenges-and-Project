import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class LandTract extends JPanel{
    private final double length; //Length of land
    private final double width;  //Width of land
    /**
     * Constructor
     * @param length The land tract's length.
     * @param width The land tract's width.
     */
    public LandTract (double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    /**
     * The copy constructor initializes the object as a copy
     * of another LandTract object.
     * @param userTract The object to copy.
     */
    public LandTract(LandTract userTract)
    {
        length = userTract.length;
        width = userTract.width;
    }
    /**
     * getArea method
     * @return The land tract's area
     */
    public double getArea()
    {
        return length*width;
    }
    /**
     * equals method
     * @param userTract copy of object
     * @return Boolean that determines whether the land tracts dimensions are equal.
     */
    public boolean equals(LandTract userTract)
    {
        boolean status;
        if (length == userTract.length &&
                width == userTract.width)
            status = true;
        else
            status = false;

        return status;
    }
    /**
     * toString method
     * @return A string that displays the object's area.
     */
    public String toString()
    {
        return "Area: " + getArea();
    }
    /**
     * The paintComponent method creates a graphic rectangle of the object and is filled with a random color.
     * @param g the <code>Graphics</code> object to protect
     */
    public void paintComponent(Graphics g) {
        Random random = new Random();
        int r = random.nextInt(256);
        int gr = random.nextInt(256);
        int b = random.nextInt(256);
        Color randomColor = new Color(r,gr,b);
        super.paintComponent(g);
        int x = getWidth()/2;
        int y = getHeight()/2;
        g.drawRect(x, y, (int)width, (int)length);
        g.setColor(randomColor);
        g.fillRect(x,y,(int)width,(int)length);
    }

    public static void main(String[] args) {
        //First Tract
        double squareOneLength = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length for the first tract of land."));
        double squareOneWidth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width for the first tract of land."));
        LandTract firstTract = new LandTract(squareOneLength,squareOneWidth);
        JOptionPane.showMessageDialog(null, "Tract 1 " + firstTract);
        JFrame frame = new JFrame("Tract 1");
        frame.setLocation(25,150);
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(firstTract);
        frame.setVisible(true);
        //Second Tract
        double squareTwoLength = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length for the second tract of land."));
        double squareTwoWidth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width for the second tract of land."));
        LandTract secondTract = new LandTract(squareTwoLength, squareTwoWidth);
        JOptionPane.showMessageDialog(null, "Tract 2 " + secondTract);
        JFrame frame2 = new JFrame("Tract 2");
        frame2.setLocation(675,150);
        frame2.setSize(600,500);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.getContentPane().add(secondTract);
        frame2.setVisible(true);
        //Displays whether the tracts are equal or not.
        if (firstTract.equals(secondTract))
            JOptionPane.showMessageDialog(null,"Both tracts have the same dimension.");
        else
            JOptionPane.showMessageDialog(null,"The tracts have different dimensions.");

        System.exit(0);
    }
}