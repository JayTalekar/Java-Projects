package Client;

import java.awt.event.ActionListener;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class Command_Client
{
    public static void main(final String[] args) throws Exception {
        System.out.println("Client Signing ON");
        final JFrame f1 = new JFrame("GUI Echo Client");
        final JTextArea ta = new JTextArea();
        ta.setEditable(false);
        final JTextField tf = new JTextField(15);
        final JButton b1 = new JButton("Send");
        final JPanel p = new JPanel();
        p.add(tf);
        p.add(b1);
        f1.add(ta);
        f1.add("South", p);
        f1.setSize(400, 400);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(3);
        final Socket soc = new Socket("127.0.0.1", 9081);
        final PrintWriter nos = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())), true);
        final BufferedReader nis = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        final L1 l1 = new L1(ta, tf, nos);
        b1.addActionListener((ActionListener)l1);
        tf.addActionListener((ActionListener)l1);
        for (String str = nis.readLine(); !str.equals("End"); str = nis.readLine()) {
            ta.append(str + "\n");
        }
        ta.append("\nClient Signing Off\n");
    }
}
