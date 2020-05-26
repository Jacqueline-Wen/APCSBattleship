import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * 
 * Runs the game with a GUI popup This class was supposed to be used to connect
 * a functional GameBoard
 *
 * @author Meghana Muddireddy
 * @version May 26, 2020
 * @author Period: 4
 * @author Assignment: Battleship
 *
 * @author Sources: none
 */
public class BattleShipGame extends JFrame
{
    private PersonVsComputer pvcGame;

    private PersonVsPerson pvpGame;

    private JTextArea display;

    /**
     * Constructor
     */
    public BattleShipGame()
    {
        Container c = getContentPane();

        // start game page
        display = new JTextArea();
        display.setBackground( Color.yellow );
        display.setForeground( Color.BLACK );
        display.setFont( new Font( "Tahoma", Font.PLAIN, 20 ) );
        display.setEditable( false );
        c.add( display, BorderLayout.NORTH );
        display.setText( "Choose a game mode to start" );
        JButton option1 = new JButton( "Person vs. Person" );
        option1.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                pvpGame = new PersonVsPerson();
            }
        } );
        JButton option2 = new JButton( "Person vs. Computer" );
        // option2.addActionListener( new PersonVsComputerGUI());
        option2.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                pvcGame = new PersonVsComputer();
            }
        } );
        c.add( option1, BorderLayout.WEST );
        c.add( option2, BorderLayout.EAST );

    }


    /**
     * 
     * Allows the popup with the game options to show up with clickable buttons
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        BattleShipGame window = new BattleShipGame();
        window.setBounds( 200, 200, 300, 225 );
        window.setDefaultCloseOperation( EXIT_ON_CLOSE );
        window.setResizable( false );
        window.setVisible( true );
    }

    // ****************************************************************************************

    /**
     * 
     * Creates a GameBoard specifically for the a person vs computer game
     * Doesn't work as needed
     *
     * @author Meghana Muddireddy
     * @version May 26, 2020
     * @author Period: 4
     * @author Assignment: Battleship
     *
     * @author Sources: none
     */
    private class PersonVsComputerGUI implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            GameBoard pvc = new GameBoard( "You" );
            GameBoard computer = new GameBoard( "Computer" );
            pvc.run();
            computer.run();
        }

    }
}
