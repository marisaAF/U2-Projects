import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RPGCharacterGUI {
    JFrame window;
    JPanel panel;
    JLabel Strength;
    JLabel Intelligence;
    JButton Calculate;
    JLabel Charisma;
    JLabel Constitution;
    static JTextField NumberS, NumberI, NumberCh, NumberC;
    static JLabel resultLabel;


    public RPGCharacterGUI() {
        window = new JFrame("A Simple Calculator");
        panel = new JPanel();

        Strength = new JLabel(" How strong is your character? ");
        Intelligence = new JLabel(" How much intelligence does your character have? ");
        Charisma = new JLabel(" How charismatic is your character? ");
        Constitution = new JLabel(" How good is your characters health? ");
        NumberS = new JTextField(1-100);
        NumberI = new JTextField(1-100);
        NumberCh = new JTextField(1-100);
        NumberC = new JTextField(1-100);

        Calculate = new JButton(" Calculate your results here! ");

        resultLabel = new JLabel("0.00");

        window.setSize(20, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        panel.add(Calculate);

        window.add(panel);
        window.setVisible(true);

    }
    private static class WealthListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double numberI = Double.parseDouble(NumberI.getText());
            double numberCh = Double.parseDouble(NumberCh.getText());

            resultLabel.setText(String.valueOf(numberI * numberCh));
        }
    }
}
