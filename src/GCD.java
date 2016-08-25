
import javax.swing.*;

public class GCD {
    
    //Euclidean algorithm technique
    public static int GCD(int m, int n)
    {
        return ((n==0)? m: GCD(n, m%n));
    }

    public static void main(String[] args) {
        //intialize a string output
        String output="";
        //Dialog box to enter numbers
        String num1 =JOptionPane.showInputDialog("\nEnter Numerator");
        String num2 =JOptionPane.showInputDialog("\nEnter Numerator");
        //Parsing string to integers
        int num = Integer.parseInt(num1);
        int denom= Integer.parseInt(num2);
        //assigning to an integer variable,results from calling
        //the GCD function
        int gcd= GCD(num, denom);
        //Display result in message dialogue
        output +="\n\tThe GCD of " + num + "and " + denom + " is " + gcd +"\n";
        JOptionPane.showMessageDialog(null, output);
    }
    
}
