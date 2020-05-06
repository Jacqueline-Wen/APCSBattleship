import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

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
        
        frame.getContentPane().add(new JButton("A1"));
        frame.getContentPane().add(new JButton("A2"));
        frame.getContentPane().add(new JButton("A3"));
        frame.getContentPane().add(new JButton("A4"));
        frame.getContentPane().add(new JButton("A5"));
        frame.getContentPane().add(new JButton("A6"));
        frame.getContentPane().add(new JButton("A7"));
        frame.getContentPane().add(new JButton("A8"));
        frame.getContentPane().add(new JButton("A9"));
        frame.getContentPane().add(new JButton("A10"));
        
        frame.getContentPane().add(new JButton("B1"));
        frame.getContentPane().add(new JButton("B2"));
        frame.getContentPane().add(new JButton("B3"));
        frame.getContentPane().add(new JButton("B4"));
        frame.getContentPane().add(new JButton("B5"));
        frame.getContentPane().add(new JButton("B6"));
        frame.getContentPane().add(new JButton("B7"));
        frame.getContentPane().add(new JButton("B8"));
        frame.getContentPane().add(new JButton("B9"));
        frame.getContentPane().add(new JButton("B10"));
        
        frame.getContentPane().add(new JButton("C1"));
        frame.getContentPane().add(new JButton("C2"));
        frame.getContentPane().add(new JButton("C3"));
        frame.getContentPane().add(new JButton("C4"));
        frame.getContentPane().add(new JButton("C5"));
        frame.getContentPane().add(new JButton("C6"));
        frame.getContentPane().add(new JButton("C7"));
        frame.getContentPane().add(new JButton("C8"));
        frame.getContentPane().add(new JButton("C9"));
        frame.getContentPane().add(new JButton("C10"));
        
        frame.getContentPane().add(new JButton("D1"));
        frame.getContentPane().add(new JButton("D2"));
        frame.getContentPane().add(new JButton("D3"));
        frame.getContentPane().add(new JButton("D4"));
        frame.getContentPane().add(new JButton("D5"));
        frame.getContentPane().add(new JButton("D6"));
        frame.getContentPane().add(new JButton("D7"));
        frame.getContentPane().add(new JButton("D8"));
        frame.getContentPane().add(new JButton("D9"));
        frame.getContentPane().add(new JButton("D10"));
        
        frame.getContentPane().add(new JButton("E1"));
        frame.getContentPane().add(new JButton("E2"));
        frame.getContentPane().add(new JButton("E3"));
        frame.getContentPane().add(new JButton("E4"));
        frame.getContentPane().add(new JButton("E5"));
        frame.getContentPane().add(new JButton("E6"));
        frame.getContentPane().add(new JButton("E7"));
        frame.getContentPane().add(new JButton("E8"));
        frame.getContentPane().add(new JButton("E9"));
        frame.getContentPane().add(new JButton("E10"));
        
        frame.getContentPane().add(new JButton("F1"));
        frame.getContentPane().add(new JButton("F2"));
        frame.getContentPane().add(new JButton("F3"));
        frame.getContentPane().add(new JButton("F4"));
        frame.getContentPane().add(new JButton("F5"));
        frame.getContentPane().add(new JButton("F6"));
        frame.getContentPane().add(new JButton("F7"));
        frame.getContentPane().add(new JButton("F8"));
        frame.getContentPane().add(new JButton("F9"));
        frame.getContentPane().add(new JButton("F10"));
        
        frame.getContentPane().add(new JButton("G1"));
        frame.getContentPane().add(new JButton("G2"));
        frame.getContentPane().add(new JButton("G3"));
        frame.getContentPane().add(new JButton("G4"));
        frame.getContentPane().add(new JButton("G5"));
        frame.getContentPane().add(new JButton("G6"));
        frame.getContentPane().add(new JButton("G7"));
        frame.getContentPane().add(new JButton("G8"));
        frame.getContentPane().add(new JButton("G9"));
        frame.getContentPane().add(new JButton("G10"));
        
        frame.getContentPane().add(new JButton("H1"));
        frame.getContentPane().add(new JButton("H2"));
        frame.getContentPane().add(new JButton("H3"));
        frame.getContentPane().add(new JButton("H4"));
        frame.getContentPane().add(new JButton("H5"));
        frame.getContentPane().add(new JButton("H6"));
        frame.getContentPane().add(new JButton("H7"));
        frame.getContentPane().add(new JButton("H8"));
        frame.getContentPane().add(new JButton("H9"));
        frame.getContentPane().add(new JButton("H10"));
        
        frame.getContentPane().add(new JButton("I1"));
        frame.getContentPane().add(new JButton("I2"));
        frame.getContentPane().add(new JButton("I3"));
        frame.getContentPane().add(new JButton("I4"));
        frame.getContentPane().add(new JButton("I5"));
        frame.getContentPane().add(new JButton("I6"));
        frame.getContentPane().add(new JButton("I7"));
        frame.getContentPane().add(new JButton("I8"));
        frame.getContentPane().add(new JButton("I9"));
        frame.getContentPane().add(new JButton("I10"));
        
        frame.getContentPane().add(new JButton("J1"));
        frame.getContentPane().add(new JButton("J2"));
        frame.getContentPane().add(new JButton("J3"));
        frame.getContentPane().add(new JButton("J4"));
        frame.getContentPane().add(new JButton("J5"));
        frame.getContentPane().add(new JButton("J6"));
        frame.getContentPane().add(new JButton("J7"));
        frame.getContentPane().add(new JButton("J8"));
        frame.getContentPane().add(new JButton("J9"));
        frame.getContentPane().add(new JButton("J10"));
       
    }

}
