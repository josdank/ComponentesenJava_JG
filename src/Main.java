import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        JFrame frame = new JFrame("Aplicación para calcular iva ");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setPreferredSize(new Dimension(1024, 768));
        frame.setMinimumSize(new Dimension(1024, 768));
        frame.pack();
        frame.setVisible(true);
    }
}