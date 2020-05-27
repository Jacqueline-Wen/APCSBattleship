import java.util.Scanner;


/**
 * 
 * Creates a new player vs player game and runs it Each player sets up their
 * ships and take turns trying to sink each others' ships
 *
 * @author Jacqueline Wen
 * @version May 26, 2020
 * @author Period: 4
 * @author Assignment: Battleship
 *
 * @author Sources: Meghana Muddireddy
 */
public class PersonVsPerson
{
    // 0- nothing, 1- boat exists, 2- miss, 3- hit
    private int[][] person1;

    private int[][] person2;

    private char[][] person1map;

    private char[][] person2map;

    private boolean person;


    /**
     * Constructer
     */
    public PersonVsPerson()
    {
        person1 = new int[10][10];
        person2 = new int[10][10];
        person1map = new char[10][10];
        person2map = new char[10][10];
        for ( int i = 0; i < 10; i++ )
        {
            for ( int j = 0; j < 10; j++ )
            {
                person1[i][j] = 0;
                person2[i][j] = 0;
                person1map[i][j] = '.';
                person2map[i][j] = '.';
            }
        }
        runningGame();
    }


    /**
     * 
     * Sets up the game and makes sure the game is running until a player wins
     */
    public void runningGame()
    {
        System.out
            .println( "Player 1, please choose the locations for your ships" );
        System.out.println(
            "Input: [rownumber columnnumber direction] while pressing enter in between" );
        person = true;
        inputForMap();
        System.out
            .println( "Player 2, please choose the locations for your ships" );
        person = false;
        inputForMap();

        person = !person;
        while ( gameOver() == 0 )
        {
            guessMove( person );
            for ( int i = 0; i < 10; i++ )
            {
                for ( int j = 0; j < 10; j++ )
                {
                    if ( person )
                    {
                        System.out.print( person1map[i][j] + " " );
                    }
                    else
                    {
                        System.out.print( person2map[i][j] + " " );
                    }
                }
                System.out.println();
            }
            if ( gameOver() == 1 )
            {
                System.out.println( "Congrats to Player 1!" );
                System.out.println();

                return;
            }
            else if ( gameOver() == 2 )
            {
                System.out.println( "Congrats to Player 2!" );
                System.out.println();

                return;
            }

            person = !person;

            System.out
                .println( "Sorry, this coordinate did not hit a battleship" );
            for ( int i = 0; i < 15; i++ )
            {
                System.out.println();
            }
        }
        if ( gameOver() == 1 )
        {
            System.out.println( "Congrats to Player 1!" );
            System.out.println();
            return;
        }
        else
        {
            System.out.println( "Congrats to Player 2!" );
            System.out.println();

            return;
        }
    }


    /**
     * 
     * Simulates a player guessing a location.
     * 
     * @param person
     *            player who is guessing
     */
    private void guessMove( boolean person )
    {
        if ( person )
        {
            System.out.println( "Player " + 1 + " please enter your guess" );
        }
        else
        {
            System.out.println( "Player " + 2 + " please enter your guess" );
        }
        for ( int i = 0; i < 10; i++ )
        {
            for ( int j = 0; j < 10; j++ )
            {
                if ( person )
                {
                    System.out.print( person1map[i][j] + " " );
                }
                else
                {
                    System.out.print( person2map[i][j] + " " );
                }
            }
            System.out.println();
        }

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
            curPos = person1[rval][cval];
        }
        if ( !person )
        {
            curPos = person2[rval][cval];
        }

        if ( curPos == 0 )
        {
            if ( person )
            {
                person1[rval][cval] = 2;
                person1map[rval][cval] = 'm';
            }
            else
            {
                person2[rval][cval] = 2;
                person2map[rval][cval] = 'm';
            }
        }
        else if ( curPos == 1 )
        {
            if ( person )
            {
                person1[rval][cval] = 3;
                person1map[rval][cval] = 'X';
            }
            else
            {
                person2[rval][cval] = 3;
                person2map[rval][cval] = 'X';
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
            guessMove( person );
        }
    }


    /**
     * Returns whether the game is over
     * 
     * @return 0 if not over, 1 if person 1 wins, 2 if person 2 wins
     */
    public int gameOver()
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
                if ( person2[i][j] == 3 )
                {
                    person2Val++;
                }
            }
        }

        if ( person1Val == 30 )
        {
            return 1;
        }

        if ( person2Val == 30 )
        {
            return 2;
        }

        return 0;
    }


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
                if ( curr > 9 || curc > 9 || person2[curr][curc] == 1 )
                {
                    return false;
                }
            }
            else
            {
                if ( curr > 9 || curc > 9 || person1[curr][curc] == 1 )
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


    // 1 boat size 5, 2 boat size 4, 3 boat size 3, 4 boat size 2
    /**
     * 
     * Fills in the array with the boats in the locations that the player
     * chooses
     * 
     * @param rval
     *            row value of the start of the ship
     * @param cval
     *            column value of the start of the ship
     * @param length
     *            the size of the ship
     * @param direction
     *            0 for a horizontal boat and 1 for a vertical ship
     */
    private void drawMap( int rval, int cval, int length, int direction )
    {
        // horizontally
        if ( direction == 0 )
        {
            for ( int i = cval; i < cval + length; i++ )
            {
                if ( !person )
                {
                    person1[rval][i] = 1;
                }
                else
                {
                    person2[rval][i] = 1;
                }
            }
        }

        // vertically
        if ( direction == 1 )
        {
            for ( int i = rval; i < rval + length; i++ )
            {
                if ( !person )
                {
                    person1[i][cval] = 1;
                }
                else
                {
                    person2[i][cval] = 1;
                }
            }
        }

        for ( int i = 0; i < 10; i++ )
        {
            for ( int j = 0; j < 10; j++ )
            {
                if ( !person )
                {
                    System.out.print( person1[i][j] + " " );
                }
                else
                {
                    System.out.print( person2[i][j] + " " );
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * 
     * Collects user input for map
     */
    public void inputForMap()
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

}
