
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This is my Lab 7 Assignment
 *
 * @author Andy Gomez Genao 
 * 10/24/2015
 */
public class LabAssign7 {
    
    public static void main(String[] args) {
        int rToss;
        
        Random rGen = new Random();
        String input, letter, luck;
        String repeat;
        char lett ;
      
        
        int win, lose;
        win = 0;
        lose = 0;
        do {
            rToss = rGen.nextInt(2);
            
            if (rToss == 0) {
                luck = "H";
            } else {
                luck = "T";
            }
            
            letter = JOptionPane.showInputDialog(null, "Enter 'H' for heads,\nEnter 'T' for tails");
            
            if (luck.equalsIgnoreCase(letter)) {
                JOptionPane.showMessageDialog(null, "You win!");
                win++;
            } else {
                
                JOptionPane.showMessageDialog(null, "Computer wins");
                lose++;
            }
            repeat = JOptionPane.showInputDialog(null, "Enter 'Y' to play again,"
                    + " 'N' to quit");
            lett=repeat.charAt(0);
        } while (lett=='y'||lett=='Y');
        JOptionPane.showMessageDialog(null, "Your score is " + win + " wins and "
                + lose + " losses.");
        System.exit(0);
    }
}
