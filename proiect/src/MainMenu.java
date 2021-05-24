import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainMenu  {



    static Container c;
   static JPanel Title_panel,New_Game_panel,Exit_Panel,Music_Panel,About_Panel;
   static JLabel Title;
   static JButton New_Game,Exit,Music,About;
   static Font font=new Font("Times New Roman",Font.PLAIN,45);
   static Font btnfont=new Font("Times New Roman",Font.PLAIN,30);
    public static void start()
    {
        MainMenu a=new MainMenu ();
        JFrame frame=new JFrame ();
        frame.setSize (640,480);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane ().setBackground (Color.BLACK);
        frame.setLayout (null);
        frame.setVisible (true);

        c=frame.getContentPane ();

        Title_panel=new JPanel ();
        Title_panel.setBounds (85,50,450,100);
        Title_panel.setBackground (Color.BLACK);
        Title=new JLabel("MAZE GENERATOR");
        Title.setForeground (Color.WHITE);
        Title.setFont (font);
        Title_panel.add (Title);

        New_Game_panel=new JPanel();
        New_Game_panel.setBounds (150,200,300,100);
        New_Game_panel.setBackground (Color.BLACK);
        New_Game=new JButton ("Generate");
        New_Game.setBackground (Color.BLACK);
        New_Game.setForeground (Color.YELLOW);
        New_Game.setFont (btnfont);
        New_Game_panel.add(New_Game);

        Exit_Panel=new JPanel();
        Exit_Panel.setBounds (150,300,300,100);
        Exit_Panel.setBackground (Color.BLACK);
        Exit=new JButton ("Exit");
        Exit.setBackground (Color.BLACK);
        Exit.setForeground (Color.WHITE);
        Exit.setFont (btnfont);
        Exit_Panel.add(Exit);

        Music_Panel=new JPanel();
        Music_Panel.setBounds (295,385,300,100);
        Music_Panel.setBackground (Color.BLACK);
        Music=new JButton ("Music");
        Music.setBackground (Color.BLACK);
        Music.setForeground (Color.BLUE);
        Music.setFont (btnfont);
        Music_Panel.add(Music);

        About_Panel=new JPanel();
        About_Panel.setBounds (40,385,300,100);
        About_Panel.setBackground (Color.BLACK);
        About=new JButton ("About");
        About.setBackground (Color.BLACK);
        About.setForeground (Color.GREEN);
        About.setFont (btnfont);
        About_Panel.add(About);

        c.add(Title_panel);
        c.add (New_Game_panel);
        c.add(Exit_Panel);
        c.add(Music_Panel);
        c.add(About_Panel);

        a.Action(a);

    }

    public void Action(MainMenu l)
    {
        New_Game.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                MazeType m=new MazeType ();
                m.select ();
            }
        });
        Exit.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                System.exit(0);
            }
        });
        Music.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                MusicMenu n=new MusicMenu ();
                n.MuMen();
            }
        });
        About.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                About a=new About ();
                a.AboutPage ();
            }
        });
    }


}
