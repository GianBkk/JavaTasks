import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {

    public static void gui(){

        JFrame f = new JFrame();
        f.setSize(400,500);

        JButton button = new JButton("Speichern");
        f.add(button, BorderLayout.PAGE_END);

        /*JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.gray);
        textArea.setFont(new Font("Serif", Font.ITALIC, 17));*/

        //f.add(textArea);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button gedrueckt!");
            }
        });



        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
