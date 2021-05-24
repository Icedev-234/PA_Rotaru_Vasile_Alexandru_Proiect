import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MazeType {
    static Container c;
    static JPanel B1_Panel,B2_Panel,B3_Panel,Ret_Panel;
   static  JButton B1,B2,B3,Ret;
    private static int width,height,minW,minH;

   static Font btnfont=new Font("Times New Roman",Font.PLAIN,30);
    public static void select()
    {

        JFrame frame=new JFrame ();
        frame.setSize (640,480);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane ().setBackground (Color.BLACK);
        frame.setLayout (null);
        frame.setVisible (true);

        c=frame.getContentPane ();

        B1_Panel=new JPanel();
        B1_Panel.setBounds (150,125,300,100);
        B1_Panel.setBackground (Color.BLACK);
        B1=new JButton ("320x240");
        B1.setBackground (Color.BLACK);
        B1.setForeground (Color.WHITE);
        B1.setFont (btnfont);
        B1_Panel.add(B1);
        c.add(B1_Panel);

        B2_Panel=new JPanel();
        B2_Panel.setBounds (150,180,300,100);
        B2_Panel.setBackground (Color.BLACK);
        B2=new JButton ("640x480");
        B2.setBackground (Color.BLACK);
        B2.setForeground (Color.WHITE);
        B2.setFont (btnfont);
        B2_Panel.add(B2);
        c.add(B2_Panel);

        B3_Panel=new JPanel();
        B3_Panel.setBounds (150,235,300,100);
        B3_Panel.setBackground (Color.BLACK);
        B3=new JButton ("1280x720");
        B3.setBackground (Color.BLACK);
        B3.setForeground (Color.WHITE);
        B3.setFont (btnfont);
        B3_Panel.add(B3);
        c.add(B3_Panel);


        Ret_Panel=new JPanel();
        Ret_Panel.setBounds (10,350,300,100);
        Ret_Panel.setBackground (Color.BLACK);
        Ret=new JButton ("Back");
        Ret.setBackground (Color.BLACK);
        Ret.setForeground (Color.WHITE);
        Ret.setFont (btnfont);
        Ret_Panel.add(Ret);
        c.add(Ret_Panel);

        MazeType.GenAction(frame);

    }

  public static void GenAction(JFrame f)
  {

      Ret.addActionListener (new ActionListener () {
          @Override
          public void actionPerformed (ActionEvent e) {
              f.setVisible (false);
          }
      });
      B1.addActionListener (new ActionListener () {
          @Override
          public void actionPerformed (ActionEvent e) {
            width=320;
            height=240;
            minW=15;
            minH=15;
            Maze2D m=new Maze2D (width,height,minW,minH);

          }
      });
      B2.addActionListener (new ActionListener () {
          @Override
          public void actionPerformed (ActionEvent e) {
              width=640;
              height=480;
              minW=20;
              minH=20;
              Maze2D m=new Maze2D(width,height,minW,minH);
          }
      });
      B3.addActionListener (new ActionListener () {
          @Override
          public void actionPerformed (ActionEvent e) {
              width=1280;
              height=720;
              minW=25;
              minH=25;
              Maze2D m=new Maze2D (width,height,minW,minH);
          }
      });
  }

}
