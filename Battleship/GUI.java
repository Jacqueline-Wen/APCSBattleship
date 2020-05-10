import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI
{

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main( String[] args )
    {
        EventQueue.invokeLater( new Runnable()
        {
            public void run()
            {
                try
                {
                    GUI window = new GUI();
                    window.frame.setVisible( true );
                }
                catch ( Exception e )
                {
                    e.printStackTrace();
                }
            }
        } );
    }


    /**
     * Create the application.
     */
    public GUI()
    {
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds( 100, 100, 1000, 1000 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setLayout(new GridLayout(10,10));
        
        JButton button = new JButton("A1");
        button.setForeground(new Color(255, 255, 255));
        button.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button);
        JButton button_1 = new JButton("A2");
        button_1.setForeground(new Color(255, 255, 255));
        button_1.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_1);
        JButton button_2 = new JButton("A3");
        button_2.setForeground(new Color(255, 255, 255));
        button_2.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_2);
        JButton button_3 = new JButton("A4");
        button_3.setForeground(new Color(255, 255, 255));
        button_3.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_3);
        JButton button_4 = new JButton("A5");
        button_4.setForeground(new Color(255, 255, 255));
        button_4.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_4);
        JButton button_5 = new JButton("A6");
        button_5.setForeground(new Color(255, 255, 255));
        button_5.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_5);
        JButton button_6 = new JButton("A7");
        button_6.setForeground(new Color(255, 255, 255));
        button_6.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_6);
        JButton button_7 = new JButton("A8");
        button_7.setForeground(new Color(255, 255, 255));
        button_7.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_7);
        JButton button_8 = new JButton("A9");
        button_8.setForeground(new Color(255, 255, 255));
        button_8.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_8);
        JButton button_9 = new JButton("A10");
        button_9.setForeground(new Color(255, 255, 255));
        button_9.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_9);
        
        JButton button_10 = new JButton("B1");
        button_10.setForeground(new Color(255, 255, 255));
        button_10.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_10);
        JButton button_11 = new JButton("B2");
        button_11.setForeground(new Color(255, 255, 255));
        button_11.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_11);
        JButton button_12 = new JButton("B3");
        button_12.setForeground(new Color(255, 255, 255));
        button_12.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_12);
        JButton button_13 = new JButton("B4");
        button_13.setForeground(new Color(255, 255, 255));
        button_13.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_13);
        JButton button_14 = new JButton("B5");
        button_14.setForeground(new Color(255, 255, 255));
        button_14.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_14);
        JButton button_15 = new JButton("B6");
        button_15.setForeground(new Color(255, 255, 255));
        button_15.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_15);
        JButton button_16 = new JButton("B7");
        button_16.setForeground(new Color(255, 255, 255));
        button_16.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_16);
        JButton button_17 = new JButton("B8");
        button_17.setForeground(new Color(255, 255, 255));
        button_17.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_17);
        JButton button_18 = new JButton("B9");
        button_18.setForeground(new Color(255, 255, 255));
        button_18.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_18);
        JButton button_19 = new JButton("B10");
        button_19.setForeground(new Color(255, 255, 255));
        button_19.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_19);
        
        JButton button_20 = new JButton("C1");
        button_20.setForeground(new Color(255, 255, 255));
        button_20.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_20);
        JButton button_21 = new JButton("C2");
        button_21.setForeground(new Color(255, 255, 255));
        button_21.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_21);
        JButton button_22 = new JButton("C3");
        button_22.setForeground(new Color(255, 255, 255));
        button_22.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_22);
        JButton button_23 = new JButton("C4");
        button_23.setForeground(new Color(255, 255, 255));
        button_23.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_23);
        JButton button_24 = new JButton("C5");
        button_24.setForeground(new Color(255, 255, 255));
        button_24.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_24);
        JButton button_25 = new JButton("C6");
        button_25.setForeground(new Color(255, 255, 255));
        button_25.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_25);
        JButton button_26 = new JButton("C7");
        button_26.setForeground(new Color(255, 255, 255));
        button_26.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_26);
        JButton button_27 = new JButton("C8");
        button_27.setForeground(new Color(255, 255, 255));
        button_27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        button_27.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_27);
        JButton button_28 = new JButton("C9");
        button_28.setForeground(new Color(255, 255, 255));
        button_28.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_28);
        JButton button_29 = new JButton("C10");
        button_29.setForeground(new Color(255, 255, 255));
        button_29.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_29);
        
        JButton button_30 = new JButton("D1");
        button_30.setForeground(new Color(255, 255, 255));
        button_30.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_30);
        JButton button_31 = new JButton("D2");
        button_31.setForeground(new Color(255, 255, 255));
        button_31.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_31);
        JButton button_32 = new JButton("D3");
        button_32.setForeground(new Color(255, 255, 255));
        button_32.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_32);
        JButton button_33 = new JButton("D4");
        button_33.setForeground(new Color(255, 255, 255));
        button_33.setBackground(new Color(0, 0, 205));
        button_33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        frame.getContentPane().add(button_33);
        JButton button_34 = new JButton("D5");
        button_34.setForeground(new Color(255, 255, 255));
        button_34.setBackground(new Color(0, 0, 205));
        button_34.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        frame.getContentPane().add(button_34);
        JButton button_35 = new JButton("D6");
        button_35.setForeground(new Color(255, 255, 255));
        button_35.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_35);
        JButton button_36 = new JButton("D7");
        button_36.setForeground(new Color(255, 255, 255));
        button_36.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_36);
        JButton button_37 = new JButton("D8");
        button_37.setForeground(new Color(255, 255, 255));
        button_37.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_37);
        JButton button_38 = new JButton("D9");
        button_38.setForeground(new Color(255, 255, 255));
        button_38.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_38);
        JButton button_39 = new JButton("D10");
        button_39.setForeground(new Color(255, 255, 255));
        button_39.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_39);
        
        JButton button_40 = new JButton("E1");
        button_40.setForeground(new Color(255, 255, 255));
        button_40.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_40);
        JButton button_41 = new JButton("E2");
        button_41.setForeground(new Color(255, 255, 255));
        button_41.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_41);
        JButton button_42 = new JButton("E3");
        button_42.setForeground(new Color(255, 255, 255));
        button_42.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_42);
        JButton button_43 = new JButton("E4");
        button_43.setForeground(new Color(255, 255, 255));
        button_43.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_43);
        JButton button_44 = new JButton("E5");
        button_44.setForeground(new Color(255, 255, 255));
        button_44.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_44);
        JButton button_45 = new JButton("E6");
        button_45.setForeground(new Color(255, 255, 255));
        button_45.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_45);
        JButton button_46 = new JButton("E7");
        button_46.setForeground(new Color(255, 255, 255));
        button_46.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_46);
        JButton button_47 = new JButton("E8");
        button_47.setForeground(new Color(255, 255, 255));
        button_47.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_47);
        JButton button_48 = new JButton("E9");
        button_48.setForeground(new Color(255, 255, 255));
        button_48.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_48);
        JButton button_49 = new JButton("E10");
        button_49.setForeground(new Color(255, 255, 255));
        button_49.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_49);
        
        JButton button_50 = new JButton("F1");
        button_50.setForeground(new Color(255, 255, 255));
        button_50.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_50);
        JButton button_51 = new JButton("F2");
        button_51.setForeground(new Color(255, 255, 255));
        button_51.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_51);
        JButton button_52 = new JButton("F3");
        button_52.setForeground(new Color(255, 255, 255));
        button_52.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_52);
        JButton button_53 = new JButton("F4");
        button_53.setForeground(new Color(255, 255, 255));
        button_53.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_53);
        JButton button_54 = new JButton("F5");
        button_54.setForeground(new Color(255, 255, 255));
        button_54.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_54);
        JButton button_55 = new JButton("F6");
        button_55.setForeground(new Color(255, 255, 255));
        button_55.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_55);
        JButton button_56 = new JButton("F7");
        button_56.setForeground(new Color(255, 255, 255));
        button_56.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_56);
        JButton button_57 = new JButton("F8");
        button_57.setForeground(new Color(255, 255, 255));
        button_57.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_57);
        JButton button_58 = new JButton("F9");
        button_58.setForeground(new Color(255, 255, 255));
        button_58.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_58);
        JButton button_59 = new JButton("F10");
        button_59.setForeground(new Color(255, 255, 255));
        button_59.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_59);
        
        JButton button_60 = new JButton("G1");
        button_60.setForeground(new Color(255, 255, 255));
        button_60.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_60);
        JButton button_61 = new JButton("G2");
        button_61.setForeground(new Color(255, 255, 255));
        button_61.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_61);
        JButton button_62 = new JButton("G3");
        button_62.setForeground(new Color(255, 255, 255));
        button_62.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_62);
        JButton button_63 = new JButton("G4");
        button_63.setForeground(new Color(255, 255, 255));
        button_63.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_63);
        JButton button_64 = new JButton("G5");
        button_64.setForeground(new Color(255, 255, 255));
        button_64.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_64);
        JButton button_65 = new JButton("G6");
        button_65.setForeground(new Color(255, 255, 255));
        button_65.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_65);
        JButton button_66 = new JButton("G7");
        button_66.setForeground(new Color(255, 255, 255));
        button_66.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_66);
        JButton button_67 = new JButton("G8");
        button_67.setForeground(new Color(255, 255, 255));
        button_67.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_67);
        JButton button_68 = new JButton("G9");
        button_68.setForeground(new Color(255, 255, 255));
        button_68.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_68);
        JButton button_69 = new JButton("G10");
        button_69.setForeground(new Color(255, 255, 255));
        button_69.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_69);
        
        JButton button_70 = new JButton("H1");
        button_70.setForeground(new Color(255, 255, 255));
        button_70.setBackground(new Color(0, 0, 205));
        button_70.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        frame.getContentPane().add(button_70);
        JButton button_71 = new JButton("H2");
        button_71.setForeground(new Color(255, 255, 255));
        button_71.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_71);
        JButton button_72 = new JButton("H3");
        button_72.setForeground(new Color(255, 255, 255));
        button_72.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_72);
        JButton button_73 = new JButton("H4");
        button_73.setForeground(new Color(255, 255, 255));
        button_73.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_73);
        JButton button_74 = new JButton("H5");
        button_74.setForeground(new Color(255, 255, 255));
        button_74.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_74);
        JButton button_75 = new JButton("H6");
        button_75.setForeground(new Color(255, 255, 255));
        button_75.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_75);
        JButton button_76 = new JButton("H7");
        button_76.setForeground(new Color(255, 255, 255));
        button_76.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_76);
        JButton button_77 = new JButton("H8");
        button_77.setForeground(new Color(255, 255, 255));
        button_77.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_77);
        JButton button_78 = new JButton("H9");
        button_78.setForeground(new Color(255, 255, 255));
        button_78.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_78);
        JButton button_79 = new JButton("H10");
        button_79.setForeground(new Color(255, 255, 255));
        button_79.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_79);
        
        JButton button_80 = new JButton("I1");
        button_80.setForeground(new Color(255, 255, 255));
        button_80.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_80);
        JButton button_81 = new JButton("I2");
        button_81.setForeground(new Color(255, 255, 255));
        button_81.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_81);
        JButton button_82 = new JButton("I3");
        button_82.setForeground(new Color(255, 255, 255));
        button_82.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_82);
        JButton button_83 = new JButton("I4");
        button_83.setForeground(new Color(255, 255, 255));
        button_83.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_83);
        JButton button_84 = new JButton("I5");
        button_84.setForeground(new Color(255, 255, 255));
        button_84.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_84);
        JButton button_85 = new JButton("I6");
        button_85.setForeground(new Color(255, 255, 255));
        button_85.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_85);
        JButton button_86 = new JButton("I7");
        button_86.setForeground(new Color(255, 255, 255));
        button_86.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_86);
        JButton button_87 = new JButton("I8");
        button_87.setForeground(new Color(255, 255, 255));
        button_87.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_87);
        JButton button_88 = new JButton("I9");
        button_88.setForeground(new Color(255, 255, 255));
        button_88.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_88);
        JButton button_89 = new JButton("I10");
        button_89.setForeground(new Color(255, 255, 255));
        button_89.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_89);
        
        JButton button_90 = new JButton("J1");
        button_90.setForeground(new Color(255, 255, 255));
        button_90.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_90);
        JButton button_91 = new JButton("J2");
        button_91.setForeground(new Color(255, 255, 255));
        button_91.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_91);
        JButton button_92 = new JButton("J3");
        button_92.setForeground(new Color(255, 255, 255));
        button_92.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_92);
        JButton button_93 = new JButton("J4");
        button_93.setForeground(new Color(255, 255, 255));
        button_93.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_93);
        JButton button_94 = new JButton("J5");
        button_94.setForeground(new Color(255, 255, 255));
        button_94.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_94);
        JButton button_95 = new JButton("J6");
        button_95.setForeground(new Color(255, 255, 255));
        button_95.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_95);
        JButton button_96 = new JButton("J7");
        button_96.setForeground(new Color(255, 255, 255));
        button_96.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_96);
        JButton button_97 = new JButton("J8");
        button_97.setForeground(new Color(255, 255, 255));
        button_97.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_97);
        JButton button_98 = new JButton("J9");
        button_98.setForeground(new Color(255, 255, 255));
        button_98.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_98);
        JButton button_99 = new JButton("J10");
        button_99.setForeground(new Color(255, 255, 255));
        button_99.setBackground(new Color(0, 0, 205));
        frame.getContentPane().add(button_99);
       
    }

}
