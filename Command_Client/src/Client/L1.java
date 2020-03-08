package Client;

import java.awt.event.ActionEvent;
import java.io.PrintWriter;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;

class L1 implements ActionListener
{
    private JTextArea ta;
    private JTextField tf;
    private PrintWriter nos;
    
    public L1(final JTextArea ta, final JTextField tf, final PrintWriter nos) {
        this.ta = ta;
        this.tf = tf;
        this.nos = nos;
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        final String str = this.tf.getText();
        this.nos.println(str);
        this.tf.setText("");
        if (str.equals("End")) {
            this.nos.close();
            System.exit(0);
        }
    }
}
