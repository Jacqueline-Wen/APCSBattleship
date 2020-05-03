import java.util.*;


public class StartPage
{
    public static void main(String[] args)
    {
        System.out.println( "Choose type of game" );
        System.out.println( "For Player vs Player, type 1" );
        System.out.println( "For Player vs Player, type 2" );
        Scanner scan = new Scanner( System.in );
        int response = scan.nextInt();
        if ( response == 1 )
        {
            PersonVsPerson hi = new PersonVsPerson();
        }
        else if ( response == 2 )
        {
            PersonVsComputer hi = new PersonVsComputer();
        }
        else
        {
            return;
        }
    }
}
