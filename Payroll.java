import javax.swing.JOptionPane;
public class Payroll {

    public static void getInfo(int[] employeeID, int[] hours, double[] payRate) {
        int userHours;
        double userSalary;
        for (int i = 0; i < employeeID.length; i++) {
            boolean input = false;
            boolean input2 = false;
            while (!input) {
                try {
                    do {
                        userHours = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked for Employee " + employeeID[i]));
                        if (userHours <= 0) {
                            JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
                        } else {
                            hours[i] = userHours;
                            input = true;
                        }
                    } while (userHours <= 0);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
                }
            }
            while (!input2) {
                try {
                    do {
                        userSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter the hourly pay rate for Employee " + employeeID[i]));
                        if (userSalary <= 6.00) {
                            JOptionPane.showMessageDialog(null, "Please make sure the pay rate is above $6.00 and is a positive value.");
                        } else {
                            payRate[i] = userSalary;
                            input2 = true;
                        }
                    } while (userSalary <= 6.00);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please make sure the pay rate is above $6.00 and is a positive value.");
                }

            }
        }
        getGrossPay(hours, payRate, employeeID);
    }

    public static void getGrossPay(int[] hours, double[] payRate, int[] employeeID) {
        double total;
        double[] grossPay = new double[7];
        for (int i = 0; i < grossPay.length; i++) {
            for (int n = 0; n < hours.length; n++) {
                total = hours[n] * payRate[n];
                grossPay[n] = total;
            }
        }
        int userInput;
        do {
            userInput = Integer.parseInt(JOptionPane.showInputDialog("""
                     Enter 1 to display each employee's gross pay
                     Enter 2 to see a specific employee's gross pay
                     Enter 3 to exit
                    \s"""));
            switch (userInput) {
                case 1:
                    showAllEmployees(grossPay, hours, payRate, employeeID);
                    break;
                case 2:
                    showSpecificEmployee(grossPay, hours, payRate, employeeID);
                    break;
                case 3:
                    endProgram();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
            }
        } while (userInput == 1 || userInput == 2);
    }

    public static void showAllEmployees(double[] grossPay, int[] hours, double[] payRate, int[] employeeID) {
        for (int i = 0; i < employeeID.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "Employee ID: " + employeeID[i] +
                            "\nHours worked: " + hours[i] +
                            "\nPay rate: $" + String.format("%.2f", payRate[i]) +
                            "\nTotal wages: $" + String.format("%.2f", grossPay[i]));
        }
    }

    public static void showSpecificEmployee(double[] grossPay, int[] hours, double[] payRate, int[] employeeID) {
        int userID;
        boolean input = false;
        while (!input) {
            try {
                do {
                    userID = Integer.parseInt(JOptionPane.showInputDialog("Please enter the employee's ID: "));
                    if (userID <= 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a positive integer.");
                    } else {
                        input = true;

                        int index = -1;
                        for (int i = 0; i < employeeID.length; i++) {
                            if (userID == employeeID[i]) {
                                index = i;
                                break;
                            }
                        }
                        if (index != -1) {
                            JOptionPane.showMessageDialog(null, "Employee ID: " + employeeID[index] + "\nHours worked: " +
                                    hours[index] + "\nPay rate: $" + String.format("%.2f", payRate[index]) + "\nWages: $" + String.format("%.2f", grossPay[index]));

                        }
                    }
                } while (userID <= 0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
            }
        }
    }

    public static void endProgram() {
        System.exit(0);
    }

    public static void main(String[] args) {
        final int employNum = 7;
        int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7850489};
        int[] hours = new int[employNum];
        double[] payRate = new double[employNum];
        getInfo(employeeID, hours, payRate);

        System.exit(0);
    }
}