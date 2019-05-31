
import javax.swing.JOptionPane;

/**
 * Question number 2 of Final
 * @author Andy J. Gomez Genao
 * 12/11/2015
 */
public class IsPrime3 {

    public static void main(String[] args) {
        String input;     //To hold keyboard input

        String message;   //Message o dsiplay
        int number;       //Number to check for prime

        String answer;
        String y = "YES";
        boolean prime = true; // Initialize  to true at start
        //Get number.
        do {
            do {
                input = JOptionPane.showInputDialog("Enter a number greater than 1.");
                number = Integer.parseInt(input);
                prime = isPrime(number);
            } while (number <= 1);

            //Determine whether it is prime or not.
            if (prime) {
                message = "The number" + number + " is a prime";
            } else {
                message = "The number " + number + " is not a prime";
            }
            //display a message.
            JOptionPane.showMessageDialog(null, message);
            answer = JOptionPane.showInputDialog(null, "Do you whant to continue?\n"
                    + "Enter YES to repeat:");
        } while (answer.equalsIgnoreCase(y));

        System.exit(0);
    }

    public static boolean isPrime(int num) {
        {
            boolean prime = true; // Initialize  to true at start
            for (int i = 2; i <= num / 2; i++) // loop to test for prime
            {
                if (num % i == 0) // if i divides evenly then not prime
                {
                    prime = false;
                    break; // exit the loop

                }

            }
            return prime;
        }

    }

}
