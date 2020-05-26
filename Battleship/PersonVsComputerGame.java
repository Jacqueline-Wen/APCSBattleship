import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PersonVsComputerGame extends JFrame
{
    private PersonVsComputer pvcGame;
    
    private PersonVsPerson pvpGame;
    
    private JTextArea display;
    
    public PersonVsComputerGame()
    {
        Container c = getContentPane();

        //start game page
        display = new JTextArea();
        display.setBackground( Color.yellow );
        display.setForeground( Color.BLACK );
        display.setFont(new Font("Tahoma", Font.PLAIN, 20));
        display.setEditable( false );
        c.add( display, BorderLayout.NORTH );
        display.setText( "Choose a game mode to start" );
        JButton option1 = new JButton("Person vs. Person");
        option1.addActionListener( new PersonVsPersonGUI() );
        
        //option1.addActionListener(new ActionListener() {
            //public void actionPerformed(ActionEvent e) {
                //pvpGame = new PersonVsPerson();
            //}
        //});
        JButton option2 = new JButton("Person vs. Computer");
        option2.addActionListener( new PersonVsComputerGUI());
        //option2.addActionListener(new ActionListener() {
            //public void actionPerformed(ActionEvent e) {
              //  pvcGame = new PersonVsComputer();
            //}
        //});
        c.add( option1, BorderLayout.WEST );
        c.add( option2, BorderLayout.EAST);
        
    }
    
    public static void main (String [] args)
    {
        PersonVsComputerGame window = new PersonVsComputerGame();
        window.setBounds( 200, 200, 300, 225 );
        window.setDefaultCloseOperation( EXIT_ON_CLOSE );
        window.setResizable( false );
        window.setVisible( true );
    }


//****************************************************************************************

    private class PersonVsPersonGUI implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            GameBoard player1 = new GameBoard("Player 1");
            GameBoard player2 = new GameBoard("Player 2");
            
                
        }
    }
    
    private class PersonVsComputerGUI implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            GameBoard pvc = new GameBoard("You");
            
            pvc.run();
        }
        
    }
}
