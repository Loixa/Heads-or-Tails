
import javax.swing.JFrame;


/**
 *
 * @author Loiza
 */
public class Calculator {

    public static void main(String[] args) {
        Body body = new Body();
        body.Body();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(415,660);
        frame.setVisible(true);
        frame.setTitle("Java Calculator");
        frame.add(body);
        
        
        
        
    }
    
}
