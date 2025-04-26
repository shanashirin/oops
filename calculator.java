import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame {
    TextField t1 = new TextField(), t2 = new TextField(), t3 = new TextField();
    Label l3 = new Label("Result");

    public calculator() {
        setTitle("Calculator");
        setLayout(null);
        setSize(350, 400);

        addLabel("Enter 1st No", 100, 45);
        addTextField(t1, 100, 75);
        addLabel("Enter 2nd No", 100, 110);
        addTextField(t2, 100, 145);
        addLabel("Result", 100, 170);
        addTextField(t3, 100, 185);

        addButton("+", 65, 210, (a, b) -> a + b);
        addButton("-", 155, 210, (a, b) -> a - b);
        addButton("*", 245, 210, (a, b) -> a * b);
        addButton("/", 95, 260, (a, b) -> a / b);
        addButton("%", 195, 260, (a, b) -> a % b);

        Button exit = new Button("EXIT");
        exit.setBounds(140, 320, 70, 40);
        exit.addActionListener(e -> System.exit(0));
        add(exit);

        setVisible(true);
    }

    void addLabel(String text, int x, int y) {
        Label l = new Label(text);
        l.setBounds(x, y, 145, 20);
        add(l);
    }

    void addTextField(TextField tf, int x, int y) {
        tf.setBounds(x, y, 145, 20);
        tf.setEditable(true);
        add(tf);
    }

    void addButton(String label, int x, int y, Operation op) {
        Button b = new Button(label);
        b.setBounds(x, y, 80, 40);
        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b2 = Integer.parseInt(t2.getText());
            int res = op.calc(a, b2);
            l3.setText(a + label + b2 + "=" + res);
            t3.setText(String.valueOf(res));
        });
        add(b);
    }

    interface Operation {
        int calc(int a, int b);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

