package car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton carIdButton;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(650, 550);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }



}
