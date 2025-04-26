import java.awt.*;
import java.awt.event.*;

public class MaxOfThree extends Frame implements ActionListener {
    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button b;

    MaxOfThree() {
        setTitle("Maximum of three numbers:");
        
        l1 = new Label("Number 1:");
        l2 = new Label("Number 2:");
        l3 = new Label("Number 3:");
        result = new Label("Maximum:");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        b = new Button("Find Maximum");

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        add(result);

        b.addActionListener(this);

        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int num3 = Integer.parseInt(t3.getText());

        int max = Math.max(num1, Math.max(num2, num3));
        result.setText("Maximum: " + max);
    }

    public static void main(String[] args) {
        new MaxOfThree();
    }
}

