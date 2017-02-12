import java.util.Scanner;

/**
 * Created by ismailcam on 12/02/2017.
 */
public class TriangleController
{


    public TriangleController()
    {
        runProgram();
    }

    /**
     * is the triangle a valid or invalid triangle
     *
     * @param triangle
     * @return
     */
    private boolean isValid(Triangle triangle)
    {
        int a = triangle.getA();
        int b = triangle.getB();
        int c = triangle.getC();

        // The formula
        return ( ( a + b > c ) && ( a + c > b ) && ( b + c > a ) );
    }


    /**
     * Checks the triangle sides
     *
     * @param triangle
     * @return
     */
    private int getTriangleType(Triangle triangle)
    {
        int[] sides = { triangle.getA(), triangle.getB(), triangle.getC() };

        int counter = 0;

        for( int i = 0; i < sides.length; i++ )
        {
            for( int j = 0; j < sides.length; j++ )
            {
                if( i != j )
                {
                    if( sides[ i ] == sides[ j ] )
                    {
                        counter++;
                    }
                }

            }
        }

        return counter;
    }

    /**
     * Get the triangle type
     *
     * @param triangle
     * @return
     */
    private String getTriangleTypeName(Triangle triangle)
    {
        if( isValid( triangle ) )
        {

            switch( getTriangleType( triangle ) )
            {
                case 0:
                    return "Vilkårlig trekant";

                case 2:
                    return "Ligebenet trekant";

                case 6:
                    return "Ligesidet trekant";

                default:
                    return "Ugyldig trekant";
            }
        }


        return "Ugyldig trekant";
    }


    /**
     * get the input from user.
     *
     * @return
     */
    private int getUserInput()
    {
        while( true )
        {
            try
            {
                System.out.println( "Indtast side: " );
                return Integer.parseInt( new Scanner( System.in ).next() );
            }
            catch( NumberFormatException ne )
            {
                System.out.println( "*** Fejl! Indtast venligst kun integer.\n" );
            }
        }
    }

    /**
     * Star the program
     */
    private void runProgram()
    {
        System.out.println( "==================================" );
        System.out.println( "======= Print trekant type =======" );
        System.out.println( "==================================" );

        int a = getUserInput();
        int b = getUserInput();
        int c = getUserInput();

        System.out.println( getTriangleTypeName( new Triangle( a, b, c ) ) );
    }

}
