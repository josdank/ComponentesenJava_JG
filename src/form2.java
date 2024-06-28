import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    public JPanel menu2;
    private JButton aceptar2bt;

    public form2() {
        aceptar2bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenido al menu 3");
                JFrame frame = new JFrame("Bienvenido");
                frame.setContentPane(new form3().menu3);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1024, 768);
                frame.setPreferredSize(new Dimension(1024, 768));
                frame.setMinimumSize(new Dimension(1024, 768));
                frame.pack();
                frame.setVisible(true);

                // Cierra la ventana actual
                ((JFrame) SwingUtilities.getWindowAncestor(aceptar2bt)).dispose();
            }
        });
    }
}
