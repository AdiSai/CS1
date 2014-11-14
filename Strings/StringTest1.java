
/**
 * Name:
 * Description:
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringTest1 extends JFrame implements ActionListener
{
    private JTextField input, result;
    private final String TITLE = "String Tester";

    public StringTest1()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        
        this.setTitle(TITLE);
        input = new JTextField(20);
        input.setBackground(Color.white);
        input.addActionListener(this);
        input.selectAll();

        result = new JTextField(20);
        result.setBackground(Color.white);
        result.setEditable(false);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Input:"));
        c.add(input);
        c.add(new JLabel("Result:"));
        c.add(result);

        input.requestFocus();
    }

    public void actionPerformed(ActionEvent e)
    {
        String str = input.getText();

        String answer = getAnswer(str);
       

        result.setText(answer); 
        input.selectAll();
    }
    
    public String getAnswer(String originalName)
    {
        String modifiedName = "";
        /*#
         *   ONLY WRITE BELOW THIS LINE
         */ 
        int x = originalName.indexOf(" ");
        String n = originalName.trim();
        String s = originalName.substring(0, x);
        String a = originalName.substring(x+1);
        String u = a.toUpperCase();
        //System.out.println(u);
        modifiedName = s+" " +u;
        /*#  AND ABOVE THIS LINE
         * 
         */ 
        return modifiedName;
        
    }

    public static void main (String[] args)
    {
        StringTest1 s = new StringTest1();

        s.setVisible(true);
    }
}

