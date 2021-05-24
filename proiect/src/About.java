
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About {
    static Container c;
    static JPanel Title_P,Description_P,Img2_P,Ret_P;
    static JLabel Title,Description,Img2;
    static JButton Ret;
    static Font btnfont=new Font("Times New Roman",Font.PLAIN,30);

    public static void AboutPage()
    {

        JFrame frame=new JFrame ();
        frame.setSize (640,480);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane ().setBackground (Color.BLACK);
        frame.setLayout (null);
        frame.setVisible (true);

        c=frame.getContentPane ();

        Title_P=new JPanel ();
        Title_P.setBounds (0,50,500,200);
        Title_P.setBackground (Color.BLACK);
        Title=new JLabel("About Maze Generator");
        Title.setForeground (Color.WHITE);
        Title.setFont (btnfont);
        Title_P.add (Title);

        Ret_P=new JPanel();
        Ret_P.setBounds (45,350,300,100);
        Ret_P.setBackground (Color.BLACK);
        Ret=new JButton ("Return");
        Ret.setBackground (Color.BLACK);
        Ret.setForeground (Color.WHITE);
        Ret.setFont (btnfont);
        Ret_P.add(Ret);

        Description_P=new JPanel();
        Description=new JLabel ();
        Description.setIcon (new ImageIcon ("./About.png"));
        Description_P.setBounds (50,140,300,200);
        Description_P.setBackground (Color.BLACK);
        Description_P.add(Description);

        Img2_P=new JPanel();
        Img2=new JLabel ();
        Img2.setIcon (new ImageIcon ("./gogeta.png"));
        Img2_P.setBounds (390,0,300,400);
        Img2_P.setBackground (Color.BLACK);
        Img2_P.add(Img2);

        c.add(Title_P);
        c.add(Ret_P);
        c.add(Img2_P);
        c.add(Description_P);

        About.Act(frame);
    }

    public static void Act(JFrame f)
    {
        Ret.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                f.setVisible (false);
            }
        });
    }
}
