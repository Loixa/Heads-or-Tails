
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * simple java Calculator.
 *
 * @author Loiza
 */
public class Body extends JPanel implements ActionListener {

    LinkedList<String> list = new LinkedList<>();
    LinkedList<String> pastE = new LinkedList<>();
    JTextArea text = new JTextArea();
    String vv, pastV;
    boolean eqq, eqq2, percentUSE, square, clear, root;
    int spot;
//Constructor.

    public Body() {
        this.vv = "";
        eqq = false;
        eqq2 = true;
        spot = 0;
        percentUSE = false;
        pastV = "";
        square = false;
        clear = false;
        root = false;
    }
//takes care of the body of the calc.

    public void Body() {

        JPanel buttonPanel = new JPanel();
        JScrollPane textPanel = new JScrollPane();
        buttonPanel.setBorder(BorderFactory.createBevelBorder(1));
        setLayout(new GridBagLayout());
        textPanel = textA();
        buttonPanel = buttonArea(buttonPanel);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.BOTH;
        add(textPanel, c);
        c.gridy = 1;

        add(buttonPanel, c);
    }

    //Creats Number Area for Calculator
    public JScrollPane textA() {

        // text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        text.setEditable(false);
        text.setText("0");
        Font font = new Font("SansSerif", Font.BOLD, 40);

        text.setFont(font);

        JScrollPane area = new JScrollPane(text);

        return area;
    }
// creates the button area

    public JPanel buttonArea(JPanel panel) {
        JPanel bArea = panel;
        JButton plus = new JButton("+");
        plus.addActionListener(this);
        JButton minus = new JButton("-");
        minus.addActionListener(this);
        JButton mult = new JButton("x");
        mult.addActionListener(this);
        JButton div = new JButton("÷");
        div.addActionListener(this);
        JButton equal = new JButton("=");
        equal.addActionListener(this);
        JButton root = new JButton("√");
        root.addActionListener(this);
        JButton square = new JButton("x²");
        square.addActionListener(this);
        JButton clear = new JButton("C");
        clear.addActionListener(this);
        JButton percent = new JButton("%");
        percent.addActionListener(this);
        JButton backspace = new JButton("◄");
        backspace.addActionListener(this);
        JButton negate = new JButton("-x");
        negate.addActionListener(this);
        JButton dot = new JButton(".");
        dot.addActionListener(this);
        JButton one = new JButton("1");
        one.addActionListener(this);
        JButton two = new JButton("2");
        two.addActionListener(this);
        JButton three = new JButton("3");
        three.addActionListener(this);
        JButton four = new JButton("4");
        four.addActionListener(this);
        JButton five = new JButton("5");
        five.addActionListener(this);
        JButton six = new JButton("6");
        six.addActionListener(this);
        JButton seven = new JButton("7");
        seven.addActionListener(this);
        JButton eight = new JButton("8");
        eight.addActionListener(this);
        JButton nine = new JButton("9");
        nine.addActionListener(this);
        JButton zero = new JButton("0");
        zero.addActionListener(this);
        JButton ce = new JButton("CE");
        ce.addActionListener(this);
        GridBagConstraints c = new GridBagConstraints();
        bArea.setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0.1;
        c.weighty = 0.1;
        c.gridx = 0;
        c.gridy = 0;
        bArea.add(percent, c);
        c.gridx = 1;
        c.gridy = 0;
        bArea.add(root, c);
        c.gridx = 2;
        c.gridy = 0;
        bArea.add(square, c);
        c.gridx = 2;
        c.gridy = 1;
        bArea.add(negate, c);
        c.gridx = 0;
        c.gridy = 1;
        bArea.add(ce, c);
        c.gridx = 1;
        c.gridy = 1;
        bArea.add(clear, c);
        c.gridx = 0;
        c.gridy = 5;
        bArea.add(backspace, c);
        c.gridx = 3;
        c.gridy = 0;
        bArea.add(div, c);
        c.gridx = 0;
        c.gridy = 2;
        bArea.add(seven, c);
        c.gridx = 1;
        c.gridy = 2;
        bArea.add(eight, c);
        c.gridx = 2;
        c.gridy = 2;
        bArea.add(nine, c);
        c.gridx = 3;
        c.gridy = 1;
        bArea.add(mult, c);
        c.gridx = 0;
        c.gridy = 3;
        bArea.add(four, c);
        c.gridx = 1;
        c.gridy = 3;
        bArea.add(five, c);
        c.gridx = 2;
        c.gridy = 3;
        bArea.add(six, c);
        c.gridx = 3;
        c.gridy = 2;
        bArea.add(minus, c);
        c.gridx = 0;
        c.gridy = 4;
        bArea.add(one, c);
        c.gridx = 1;
        c.gridy = 4;
        bArea.add(two, c);
        c.gridx = 2;
        c.gridy = 4;
        bArea.add(three, c);
        c.gridx = 3;
        c.gridy = 3;
        bArea.add(plus, c);

        c.gridx = 1;
        c.gridy = 5;
        bArea.add(zero, c);
        c.gridx = 2;
        c.gridy = 5;
        bArea.add(dot, c);
        c.gridx = 3;
        c.gridy = 4;
        c.gridheight = 2;
        bArea.add(equal, c);

        return bArea;
    }
//clears all and shows the past value on the text screen
    //used to show answer and prepare for next input.

    public void Clear(String i) {
        list.clear();
        text.setText(i);
        vv = "";
        eqq = false;
        eqq2 = true;
        spot = 0;
        square = false;
        root = false;

    }
//just an action listener

    @Override
    public void actionPerformed(ActionEvent ae) {
        clear = false;
        if (eqq) {
            list.clear();
            eqq = false;
        }
        switch (ae.getActionCommand()) {
            case "1":
                list.add("1");
                break;
            case "2":
                list.add("2");
                break;
            case "3":
                list.add("3");
                break;
            case "4":
                list.add("4");
                break;
            case "5":
                list.add("5");
                break;
            case "6":
                list.add("6");
                break;
            case "7":
                list.add("7");
                break;
            case "8":
                list.add("8");
                break;
            case "9":
                list.add("9");
                break;
            case "0":
                list.add("0");
                break;
            case "+":
                list.add("+");
                break;
            case "-":
                list.add("-");
                break;
            case "x":
                list.add("x");
                break;
            case "÷":
                list.add("÷");
                break;
            case "%":
                list.add("%");//start working on percentages 
                break;
            case ".":
                list.add(".");
                break;
            case "C":
                clear = true;
                Clear("0");

                break;
            case "CE":

                Clear("0");
                clear = true;
                pastV = "";
                break;
            case "√":
                list.add("√");
                root = true;
                break;
            case "-x":
                list.add("-");

                break;
            case "x²":
                list.add("²");
                square = true;
                break;
            case "◄":
                if (!list.isEmpty()) {
                    int i = list.size();
                    list.set(i - 1, "");
                }
                break;
            case "=":
                list.addLast("=");
                break;
            default:
                System.out.println("invalid");

        }

        if (!clear) {
            Add();
        }
    }
// takes care of the root values.
    public void Root() {
        String v = "";
        double i = 0.0;
        if (list.getLast() == "=") {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == "√" || list.get(j) == "=") {
                    //do nothing
                } else {
                    //grab only the inside values of the root
                    v += list.get(j);
                }
            }
            try {
                i = Double.parseDouble(v);
            } catch (NumberFormatException e) {
                v += ".0";
                System.out.println(v);
                i = Double.parseDouble(v);

            }

            i = Math.sqrt(i);
            v = Double.toString(i);
            Clear(v);
        }
    }
//this method takes care of the square value

    public void SquareV() {
        int i;
        String value, v;
        v = "";
        value = list.getFirst();
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == "²") {
                j = 100;
            } else {
                v += list.get(j);
            }

        }
        i = Integer.parseInt(v);
        i = i * i;
        value = Integer.toString(i);
        Clear(value);
    }
//Add grabs all the values in the "list" linked list and shows it on the screen

    public void Add() {
        String v = "";
        String tt = "";
        if (!list.isEmpty()) {
            if (list.getFirst() == "=") {
                return;
            }
            int s = list.size();
            for (int t = 0; t < s; t++) {

                v += list.get(t);
            }
        }
        text.setText(v);
        if (root) {
            Root();
        } else if (square && list.getLast() == "=") {
            SquareV();

        } else if (list.getLast() == "=") {
            Equal();

        }
    }
//Pulls all values from list and groups values ex: list=1,2,+,3
//after Pull() returns the number before the operator hence 12 then + then 3.

    public String Pull() {
        String num = "";
        boolean val = true;
        String tt = "";
        String value = "";
        int a = spot;
        //if there is a past value and were to input and operator on that past
        //equations total ex: 10 + 5 = 15, + 5 = 20
        //so if pastV has a value and the first button you click is an
        //operator.
        if (pastV != "") {
            if (!list.isEmpty()) {
                tt = list.getFirst();
            }
            if (tt == "+" || tt == "-" || tt == "x" || tt == "√" || tt == "÷"
                    || tt == "%") {
                list.addFirst(pastV);
                tt = "";

            }
        }
        while (val) {
            if (tt == "+" || tt == "-" || tt == "x" || tt == "÷"
                    || tt == "%" || tt == "=" || tt == "-x") {
                val = false;
                if (!"=".equals(tt)) {
                    a++;
                }

                //if a percentage value is found then is converted to its 
                //decimal form.
                if ("%".equals(tt)) {
                    double k;
                    int number = Integer.parseInt(value);
                    k = ((double) number / 100);
                    value = Double.toString(k);
                    percentUSE = true;
                    tt = list.get(a);
                    a++;
                }

                //seperate operands from operators
            } else {
                value += list.get(a);
                a++;
                tt = list.get(a);

            }

        }
        if (tt == "=") {
            eqq2 = false;
            spot = 0;
        }
        num = value;
        //pull operator that was found on the loop to use in another function
        vv = tt;
        spot = a;
        return num;
    }
//Equal takes care of the equations answer

    public void Equal() {
        String value1 = "";
        String operator = "";
        String operator2 = "";
        String value2 = "";
        String tt = list.get(0);
        boolean val = true;
        boolean val2 = false;
        boolean val3 = false;
        boolean val4 = false;
        int a, b, d, e, f, g;
        int c = 0;
        int totalN = 0;
        double totalDecimal = 0.0;
        double aa = 0.0;
        double bb = 0.0;
        String total = "";
        a = 0;
        b = 0;
        LinkedList<String> equation = new LinkedList<String>();
        //using pull we organize all elements into another list 
        //exp. first list has numbers and operators as tokens (1,2,+,3,=)
        // second list equation uses them as digits (12,+,3,=)
        while (eqq2) {
            equation.add(Pull());
            equation.add(vv);
        }
        //-------------------------------------
        value1 = equation.get(c);
        c++;
        //if first value is integer try this 
        try {
            a = Integer.parseInt(value1);
        } catch (NumberFormatException l) {//if first value is not int then it 
            //is a double value hence...
            aa = Double.parseDouble(value1);
            val2 = true;

        }
        operator = equation.get(c);
        if (operator == "=") {

            Clear(value1);
            return;
        }
        c++;
        value2 = equation.get(c);
        c++;
        try {//if second value is int
            b = Integer.parseInt(value2);
        } catch (NumberFormatException ll) {//if second value is not int exp double
            bb = Double.parseDouble(value2);
            val3 = true;
        }
        //if both val3 and val2 are true then both variables are decimal
        //making val4 true;
        if (val2 && val3) {
            val4 = true;
        }

        if (equation.get(c) == "=") {
            switch (operator) {
                case "+":
                    if (val4) {//if both values are decimal
                        totalDecimal = aa + bb;
                    } else if (val3) {//if only the second variable is a decimal.
                        if (percentUSE) {
                            c--;
                            double temp = a * bb;
                            temp = Math.round(temp * 100.0) / 100.0;//try 30 + 9% 
                            String temps = Double.toString(temp);
                            equation.set(c, temps);

                            totalDecimal = a + (a * bb);
                        } else {
                            totalDecimal = a + bb;
                        }

                    } else if (val2) {//if only the second variable is a decimal.

                        totalDecimal = aa + b;

                    } else {// both variables are integers
                        totalN = a + b;
                        total = Integer.toString(totalN);

                    }
                    if (val2 || val3 || val4) {//if any of the above are true.
                        total = Double.toString(totalDecimal);
                    }
                    equation.add(total);
                    break;
                case "-":
                    if (val4) {//if both values are decimal
                        totalDecimal = aa - bb;
                    } else if (val3) {//if only the second variable is a decimal.

                        totalDecimal = a - bb;

                    } else if (val2) {//if only the second variable is a decimal.

                        totalDecimal = aa - b;

                    } else {// both variables are integers
                        totalN = a - b;
                        total = Integer.toString(totalN);

                    }
                    if (val2 || val3 || val4) {//if any of the above are true.
                        total = Double.toString(totalDecimal);
                    }
                    equation.add(total);
                    break;
                case "÷":
                    DecimalFormat df = new DecimalFormat();
                    df.setMaximumFractionDigits(4);
                    double totalDiv = (double) a / b;
                    totalDiv = Math.round(totalDiv * 100.0) / 100.0;
                    total = Double.toString(totalDiv);
                    equation.add(total);
                    break;
                case "x":
                    if (val4) {//if both values are decimal
                        totalDecimal = aa * bb;
                    } else if (val3) {//if only the second variable is a decimal.

                        totalDecimal = a * bb;

                    } else if (val2) {//if only the second variable is a decimal.

                        totalDecimal = aa * b;

                    } else {// both variables are integers
                        totalN = a * b;
                        total = Integer.toString(totalN);

                    }
                    if (val2 || val3 || val4) {//if any of the above are true.
                        total = Double.toString(totalDecimal);
                    }

                    equation.add(total);

                    break;

            }

            pastV = total;
            Clear(total);

        }

    }

}
