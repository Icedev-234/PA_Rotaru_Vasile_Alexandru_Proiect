import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.stage.Stage;

import javafx.scene.media.*;

public class MusicMenu {
    static Container c;
    static JPanel M1_P,M2_P,M3_P,Ret_P,M1S_P,M2S_P,M3S_P,img_P,Title_panel;
    static JLabel Img1,Title;
    static JButton M1,M2,M3,Ret,M1S,M2S,M3S;
    static Font btnfont=new Font("Times New Roman",Font.PLAIN,30);

    static double vol=1.0;
    static String m1="./Corpse Party BCR (PSP) Chapter 1 Main Theme.wav";
    static String m2="./Ray of Hope _ Corpse Party - Remixed.wav";
    static String m3="././02-To Zanarkand-FFX OST.wav";

    static Media hit1 = new Media(new File (m1).toURI().toString());
    static AudioClip BGM1=new AudioClip (hit1.getSource ());

    static Media hit2 = new Media(new File (m2).toURI().toString());
    static AudioClip BGM2=new AudioClip (hit2.getSource ());

    static Media hit3 = new Media(new File (m3).toURI().toString());
    static AudioClip BGM3=new AudioClip (hit3.getSource ());

    public static void MuMen()
    {


        JFrame frame=new JFrame ();
        frame.setSize (640,480);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane ().setBackground (Color.BLACK);
        frame.setLayout (null);
        frame.setVisible (true);

        c=frame.getContentPane ();

        Title_panel=new JPanel ();
        Title_panel.setBounds (250,25,450,100);
        Title_panel.setBackground (Color.BLACK);
        Title=new JLabel("Music Select");
        Title.setForeground (Color.WHITE);
        Title.setFont (btnfont);
        Title_panel.add (Title);

        M1_P=new JPanel();
        M1_P.setBounds (175,100,300,100);
        M1_P.setBackground (Color.BLACK);
        M1=new JButton ("BGM 1");
        M1.setBackground (Color.BLACK);
        M1.setForeground (Color.BLUE);
        M1.setFont (btnfont);
        M1_P.add(M1);

        M2_P=new JPanel();
        M2_P.setBounds (175,150,300,100);
        M2_P.setBackground (Color.BLACK);
        M2=new JButton ("BGM 2");
        M2.setBackground (Color.BLACK);
        M2.setForeground (Color.YELLOW);
        M2.setFont (btnfont);
        M2_P.add(M2);

        M3_P=new JPanel();
        M3_P.setBounds (175,200,300,100);
        M3_P.setBackground (Color.BLACK);
        M3=new JButton ("BGM 3");
        M3.setBackground (Color.BLACK);
        M3.setForeground (Color.RED);
        M3.setFont (btnfont);
        M3_P.add(M3);

        Ret_P=new JPanel();
        Ret_P.setBounds (200,350,300,100);
        Ret_P.setBackground (Color.BLACK);
        Ret=new JButton ("Return");
        Ret.setBackground (Color.BLACK);
        Ret.setForeground (Color.WHITE);
        Ret.setFont (btnfont);
        Ret_P.add(Ret);

        M1S_P=new JPanel();
        M1S_P.setBounds (325,100,300,100);
        M1S_P.setBackground (Color.BLACK);
        M1S=new JButton ("Stop BGM1");
        M1S.setBackground (Color.BLACK);
        M1S.setForeground (Color.BLUE);
        M1S.setFont (btnfont);
        M1S_P.add(M1S);

        M2S_P=new JPanel();
        M2S_P.setBounds (325,150,300,100);
        M2S_P.setBackground (Color.BLACK);
        M2S=new JButton ("Stop BGM2");
        M2S.setBackground (Color.BLACK);
        M2S.setForeground (Color.YELLOW);
        M2S.setFont (btnfont);
        M2S_P.add(M2S);

        M3S_P=new JPanel();
        M3S_P.setBounds (325,200,300,100);
        M3S_P.setBackground (Color.BLACK);
        M3S=new JButton ("Stop BGM3");
        M3S.setBackground (Color.BLACK);
        M3S.setForeground (Color.RED);
        M3S.setFont (btnfont);
        M3S_P.add(M3S);

        img_P=new JPanel();
        Img1=new JLabel ();
        Img1.setIcon (new ImageIcon ("./vegito.png"));
        img_P.setBounds (0,0,300,400);
        img_P.setBackground (Color.BLACK);
        img_P.add(Img1);


        c.add(M1_P);
        c.add (M2_P);
        c.add(M3_P);
        c.add(Ret_P);
        c.add(M1S_P);
        c.add (M2S_P);
        c.add(M3S_P);
        c.add(img_P);
        c.add(Title_panel);


        MusicMenu.ActGen (frame);


    }

    public static void ActGen(JFrame f)
    {
        MusicMenu p=new MusicMenu ();

        Ret.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                f.setVisible (false);
            }
        });
        M1.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {

                p.music (BGM1,vol);
            }
        });
        M2.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {

                p.music (BGM2,vol);
            }
        });
        M3.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                p.music (BGM3,vol);
            }
        });
        M1S.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                p.stopM(BGM1);
            }
        });
        M2S.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                p.stopM (BGM2);
            }
        });
        M3S.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                p.stopM(BGM3);
            }
        });



    }

    public static void music(AudioClip mediaplayer,double volume)
    {

        mediaplayer.play();
        mediaplayer.setVolume (volume);

    }

    public static void stopM(AudioClip s)
    {
        s.stop();
    }





}
