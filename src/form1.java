import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField nombre;
    private JTextField contrasena;
    private JButton button1;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = "Josue";
                String password = "hola";
                String user_1 = nombre.getText();
                String password_1 = contrasena.getText();

                if (user.equals(user_1) && password.equals(password_1)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    JFrame frame = new JFrame("Bienvenido");
                    frame.setContentPane(new form2().menu2);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(1024, 768);
                    frame.setPreferredSize(new Dimension(1024, 768));
                    frame.setMinimumSize(new Dimension(1024, 768));
                    frame.pack();
                    frame.setVisible(true);

                    // Cierra la ventana actual
                    ((JFrame) SwingUtilities.getWindowAncestor(button1)).dispose();
                } else {
                    JOptionPane.showMessageDialog(null, " INGRESE CORRECTAMENTE SUS CREDENCIALES ");
                }
            }
        });

    }
}
