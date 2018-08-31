import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 25/7/18.
 */
public class ADDSUBFORM implements ActionListener

{
    JTextField textField1;
    JLabel label1;
    JTextField textField2;
    JLabel label2;
    JTextField textField3;
    JLabel label3;
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JPanel panel2;

    ADDSUBFORM()
    {
        JFrame frame=new JFrame ("AdditionSubtractionForm");
        frame.setLayout(null);
        frame.setSize(500,500);
        textField1=new JTextField();
       label1=new JLabel("FirstNumber");
        textField2=new JTextField();
        label2=new JLabel("SecondNumber");

        textField3=new JTextField();
        label3=new JLabel("Result");
        button1=new JButton("Add");
        button2=new JButton("Sub");
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(button1);
        frame.add(button2);


        textField1.setBounds(120,100,70,30);
        textField2.setBounds(120,200,90,30);
        textField3.setBounds(120,300,90,30);

        label1.setBounds(70,75,90,30);
        label2.setBounds(70,155,200,30);
        label3.setBounds(70,250,200,30);

        button1.setBounds(120,400,70,30);

        button1.addActionListener(this);

        button2.setBounds(200,400,70,30);


           frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new ADDSUBFORM();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
            textField1.getText();
             textField2.getText();
             //textField3.setText()= textField1+textField2;

    }
}
