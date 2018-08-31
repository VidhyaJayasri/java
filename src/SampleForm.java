import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 25/7/18.
 */
public class SampleForm implements ActionListener
{
    private JButton button1;
    private JPanel panel1;
    JTextField textField;
    JLabel label;

    SampleForm()
    {
        JFrame frame=new JFrame ("First App");
        button1=new JButton("Click");
        textField=new JTextField();
        label=new JLabel("FirstName");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(label);
        frame.add(textField);
        button1.setBounds(120,200,70,30);
        button1.addActionListener(this);
        textField.setBounds(120,100,70,30);
        label.setBounds(70,75,90,30);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new SampleForm();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        textField.setText("Hello Java");
        JOptionPane.showMessageDialog(null,"Hello");
    }
}
