import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class test
{
    //delete after

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
                    test window = new test();
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
    public test()
    {
        initialize();
    }


    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds( 100, 100, 450, 300 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("A1");
        btnNewButton.setBounds(15, 16, 115, 37);
        frame.getContentPane().add(btnNewButton);
    }
}