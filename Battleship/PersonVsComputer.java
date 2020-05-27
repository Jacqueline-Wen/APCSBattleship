import java.util.Random;
import java.util.Scanner;

<<<<<<< HEAD
=======

/**
 * 
 * Creates a new player vs computer game and runs it The player tries to sink
 * the computer's ships before the computer manages to sink their ships
 *
 * @author Jacqueline Wen
 * @version May 26, 2020
 * @author Period: 4
 * @author Assignment: Battleship
 *
 * @author Sources: Meghana Muddireddy
>>>>>>> f2481127de6e973bb808a37946b0e9dfb0ec4e79
 **/

public class PersonVsComputer
{
    private int[][] person1;

    private int[][] computer;

    private char[][] computerMap;

    private boolean person;


    /**
     * Constructor
     */
    public PersonVsComputer()
    {
        person1 = new int[10][10];
        computer = new int[10][10];
        computerMap = new char[10][10];
        for ( int i = 0; i < 10; i++ )
        {
            for ( int j = 0; j < 10; j++ )
            {
                person1[i][j] = 0;
                computer[i][j] = 0;
                computerMap[i][j] = '.';
            }
        }
        runningGame();
    }


    /**
     * 
     * Sets up the game and makes sure the game is running until the player or
     * computer wins
     * 
     */
    public void runningGame()
    {
        System.out
            .println( "Player, please choose the locations for your ships" );
        System.out.println(
            "Input: [rownumber columnnumber direction] while pressing enter in between" );
        person = true;
        inputForMap();
        computerGeneratedMap();

        person = !person;
        while ( gameOver() == 0 )
        {
            guessMove( person );
            person = !person;
            Random rand = new Random();
            int rval = rand.nextInt( 10 );
            int cval = rand.nextInt( 10 );
            while ( person1[rval][cval] == 2 || person1[rval][cval] == 3 )
            {
                rval = rand.nextInt( 10 );
                cval = rand.nextInt( 10 );
            }
            guessMoveComputer( rval, cval );
            for ( int i = 0; i < 10; i++ )
            {
                for ( int j = 0; j < 10; j++ )
                {
                    System.out.print( person1[i][j] + " " );
                }
                System.out.println();
            }
            System.out.println();
            person = !person;
        }
        if ( gameOver() == 1 )
        {
            System.out.println( "Congrats to Player 1!" );
            return;
        }
        else
        {
            System.out.println( "Good game!" );
            return;
        }
    }


    /**
     * 
     * Simulates the player guessing the coordinate
     * 
     * @param person
     *            whether it is the player guessing
     */
    private void guessMove( boolean person )
    {
        if ( person )
        {
            System.out.println( "Player " + 1 + " please enter your guess" );

            System.out.println();
            Scanner in = new Scanner( System.in );

            int rval, cval;
            rval = in.nextInt();
            cval = in.nextInt();
            while ( rval < 0 || rval > 9 )
            {
                System.out.println(
                    "Row number not valid. Please enter another row number" );
                rval = in.nextInt();
            }
            while ( cval < 0 || cval > 9 )
            {
                System.out.println(
                    "Column number not valid. Please enter another column number" );
                cval = in.nextInt();
            }
            int curPos = 0;
            if ( person )
            {
                curPos = computer[rval][cval];
            }

            if ( curPos == 0 )
            {
                computer[rval][cval] = 2;
                computerMap[rval][cval] = 'm';
                for ( int i = 0; i < 10; i++ )
                {
                    for ( int j = 0; j < 10; j++ )
                    {
                        System.out.print( computerMap[i][j] + " " );
                    }
                    System.out.println();
                }
            }
            else if ( curPos == 1 )
            {
                computer[rval][cval] = 3;
                computerMap[rval][cval] = 'X';
                for ( int i = 0; i < 10; i++ )
                {
                    for ( int j = 0; j < 10; j++ )
                    {
                        System.out.print( computerMap[i][j] + " " );
                    }
                    System.out.println();
                }
                if ( gameOver() == 1 || gameOver() == 2 )
                {
                    return;
                }
                guessMove( person );
            }
            else if ( curPos == 2 || curPos == 3 )
            {
                System.out.println(
                    "Sorry this location was already chosen, please choose again" );
                // System.out.println(rval + " " + cval);
                guessMove( person );
            }

        }

    }


    /**
     * 
     * simulates the computer guessing a move via a random number generator and
     * recursive floodfill
     * 
     * @param rval
     *            row number of location guessed
     * @param cval
     *            column number of location guessed
     */
    private void guessMoveComputer( int rval, int cval )
    {
        System.out.println( "computer is running for " + rval + " " + cval );
        System.out.println(
            "Note: 0 - nothing at spot, 1 - unhit boat at spot, 2 - computer aimed and missed at spot, 3 - computer hit spot" );
        if ( person1[rval][cval] == 0 )
        {
            person1[rval][cval] = 2;
            return;
        }
        else if ( person1[rval][cval] == 1 )
        {
            person1[rval][cval] = 3;
            if ( rval - 1 >= 0 && ( person1[rval - 1][cval] == 0
                || person1[rval - 1][cval] == 1 ) )
            {
                System.out.println( rval - 1 + " " + cval );
                guessMoveComputer( rval - 1, cval );
            }
            else if ( rval + 1 < 10 && ( person1[rval + 1][cval] == 0
                || person1[rval + 1][cval] == 1 ) )
            {
                System.out.println( rval + 1 + " " + cval );
                guessMoveComputer( rval + 1, cval );
            }
            else if ( cval - 1 >= 0 && ( person1[rval][cval - 1] == 0
                || person1[rval][cval - 1] == 1 ) )
            {
                System.out.println( rval + " " + ( cval - 1 ) );
                guessMoveComputer( rval, cval - 1 );
            }
            else if ( cval + 1 < 10 && ( person1[rval][cval + 1] == 0
                || person1[rval][cval + 1] == 1 ) )
            {
                System.out.println( rval + " " + cval + 1 );
                guessMoveComputer( rval, cval + 1 );
            }
            else
            {
                Random rand = new Random();
                int r = rand.nextInt( 10 );
                int c = rand.nextInt( 10 );
                guessMoveComputer( r, c );
            }
        }
    }


    /**
     * 
     * edits the computer used matrix (used as part of input)
     * 
     * @param rval
     *            row value of start location
     * @param cval
     *            column value of start location
     * @param length
     *            length of ship
     * @param direction
     *            0 - horizontal ship, 1- vertical ship
     */
    public void drawMap( int rval, int cval, int length, int direction )
    {
        // horizontally
        if ( direction == 0 )
        {
            for ( int i = cval; i < cval + length; i++ )
            {
                if ( person )
                {
                    person1[rval][i] = 1;
                }
                else
                {
                    computer[rval][i] = 1;
                }
            }
        }

        // vertically
        if ( direction == 1 )
        {
            for ( int i = rval; i < rval + length; i++ )
            {
                if ( person )
                {
                    person1[i][cval] = 1;
                }
                else
                {
                    computer[i][cval] = 1;
                }
            }
        }

        for ( int i = 0; i < 10; i++ )
        {
            for ( int j = 0; j < 10; j++ )
            {
                if ( person )
                {
                    System.out.print( person1[i][j] + " " );
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * 
     * returns whether the game is over and if so who won
     * 
     * @return 0 if game not over, 1 if player 1 won, 2 if computer won
     */
    private int gameOver()
    {
        int person1Val = 0;
        int person2Val = 0;
        for ( int i = 0; i < 10; i++ )
        {
            for ( int j = 0; j < 10; j++ )
            {
                if ( person1[i][j] == 3 )
                {
                    person1Val++;
                }
                if ( computer[i][j] == 3 )
                {
                    person2Val++;
                }
            }
        }

        if ( person2Val == 30 )
        {
            return 1;
        }

        if ( person1Val == 30 )
        {
            return 2;
        }

        return 0;
    }
    // 0- nothing, 1- boat exists, 2- miss, 3- hit


    /**
     * 
     * checks if inputed boat value overlaps/ goes out of bounds
     * 
     * @param rval
     *            row value of inputed boat
     * @param cval
     *            column value of inputed boat
     * @param direction
     *            0- horizontal boat, 1- vertical boat
     * @param length
     *            length of boat inputed
     * @return true if position works, false if it does not
     */
    private boolean positionWorks(
        int rval,
        int cval,
        int direction,
        int length )
    {
        int curr = rval;
        int curc = cval;
        for ( int i = 0; i < length; i++ )
        {
            if ( person )
            {
                if ( curr > 9 || curc > 9 || person1[curr][curc] == 1 )
                {
                    return false;
                }
            }
            else
            {
                if ( curr > 9 || curc > 9 || computer[curr][curc] == 1 )
                {
                    return false;
                }
            }

            if ( direction == 0 )
            {
                curc++;
            }
            else
            {
                curr++;
            }
        }
        return true;
    }


    /**
     * 
     * collects user input for map
     */
    private void inputForMap()
    {
        Scanner in = new Scanner( System.in );
        // inputting size 5 boat
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        while ( a < 0 || a > 9 )
        {
            System.out.println( "Please enter another value for row number" );
            a = in.nextInt();
        }
        while ( b < 0 || b > 9 )
        {
            System.out
                .println( "Please enter another value for column number" );
            b = in.nextInt();
        }
        while ( c < 0 || c > 1 )
        {
            System.out.println(
                "Please enter another value for direction (0 - horizontal, 1-vertical)" );
            c = in.nextInt();
        }
        while ( !positionWorks( a, b, c, 5 ) )
        {
            System.out.println(
                "There was an overlap on the map, please enter new values for row, column and direction" );
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
        drawMap( a, b, 5, c );
        for ( int i = 0; i < 2; i++ )
        {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            while ( a < 0 || a > 9 )
            {
                System.out
                    .println( "Please enter another value for row number" );
                a = in.nextInt();
            }
            while ( b < 0 || b > 9 )
            {
                System.out
                    .println( "Please enter another value for column number" );
                b = in.nextInt();
            }
            while ( c < 0 || c > 1 )
            {
                System.out.println(
                    "Please enter another value for direction (0 - horizontal, 1-vertical)" );
                c = in.nextInt();
            }
            while ( !positionWorks( a, b, c, 4 ) )
            {
                System.out.println(
                    "There was an overlap on the map, please enter new values for row, column and direction" );
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
            }
            drawMap( a, b, 4, c );
        }
        for ( int i = 0; i < 3; i++ )
        {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            while ( a < 0 || a > 9 )
            {
                System.out
                    .println( "Please enter another value for row number" );
                a = in.nextInt();
            }
            while ( b < 0 || b > 9 )
            {
                System.out
                    .println( "Please enter another value for column number" );
                b = in.nextInt();
            }
            while ( c < 0 || c > 1 )
            {
                System.out.println(
                    "Please enter another value for direction (0 - horizontal, 1-vertical)" );
                c = in.nextInt();
            }
            while ( !positionWorks( a, b, c, 3 ) )
            {
                System.out.println(
                    "There was an overlap on the map, please enter new values for row, column and direction" );
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
            }
            drawMap( a, b, 3, c );
        }
        for ( int i = 0; i < 4; i++ )
        {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            while ( a < 0 || a > 9 )
            {
                System.out
                    .println( "Please enter another value for row number" );
                a = in.nextInt();
            }
            while ( b < 0 || b > 9 )
            {
                System.out
                    .println( "Please enter another value for column number" );
                b = in.nextInt();
            }
            while ( c < 0 || c > 1 )
            {
                System.out.println(
                    "Please enter another value for direction (0 - horizontal, 1-vertical)" );
                c = in.nextInt();
            }
            while ( !positionWorks( a, b, c, 2 ) )
            {
                System.out.println(
                    "There was an overlap on the map, please enter new values for row, column and direction" );
                a = in.nextInt();
                b = in.nextInt();
                c = in.nextInt();
            }
            drawMap( a, b, 2, c );
        }
    }


    /**
     * 
     * uses computer to generate random map for user to guess
     */
    public void computerGeneratedMap()
    {
        person = !person;
        Random rand = new Random();
        int a, b, c;
        for ( int i = 0; i < 1; i++ )
        {
            a = rand.nextInt( 10 );
            b = rand.nextInt( 10 );
            c = rand.nextInt( 2 );

            if ( positionWorks( a, b, c, 5 ) )
            {
                drawMap( a, b, 5, c );
            }
            else
            {
                i--;
            }
        }
        for ( int i = 0; i < 2; i++ )
        {
            a = rand.nextInt( 10 );
            b = rand.nextInt( 10 );
            c = rand.nextInt( 2 );
            if ( positionWorks( a, b, c, 4 ) )
            {
                drawMap( a, b, 4, c );
            }
            else
            {
                i--;
            }
        }
        for ( int i = 0; i < 3; i++ )
        {
            a = rand.nextInt( 10 );
            b = rand.nextInt( 10 );
            c = rand.nextInt( 2 );
            if ( positionWorks( a, b, c, 3 ) )
            {
                drawMap( a, b, 3, c );
            }
            else
            {
                i--;
            }
        }
        for ( int i = 0; i < 4; i++ )
        {
            a = rand.nextInt( 10 );
            b = rand.nextInt( 10 );
            c = rand.nextInt( 2 );
            if ( positionWorks( a, b, c, 2 ) )
            {
                drawMap( a, b, 2, c );
            }
            else
            {
                i--;
            }
        }

        // for ( int i = 0; i < 10; i++ )
        // {
        // for ( int j = 0; j < 10; j++ )
        // {
        // System.out.print( computer[i][j] );
        // }
        // System.out.println();
        // }
    }
}
