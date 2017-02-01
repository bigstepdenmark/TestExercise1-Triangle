/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softtestex1;

/**
 *
 * @author Ismail Cam
 */
public class TriangleController
{

    public String getTriangleType( Triangle triangle )
    {
        if ( triangle.getA() <= 0 || triangle.getB() <= 0 || triangle.getC() <= 0 )
        {
            return "Fejl! en trekant SKAL have 3 sider!";
        }

        switch ( checkTriangleSides( triangle ) )
        {
            case 0:
                return "Vilkårlig trekant";

            case 2:
                return "Ligebenet trekant";

            case 6:
                return "Ligesidet trekant";
        }

        return null;
    }

    private int checkTriangleSides( Triangle triangle )
    {
        int[] sides =
        {
            triangle.getA(), triangle.getB(), triangle.getC()
        };

        int counter = 0;

        for ( int i = 0; i < sides.length; i++ )
        {
            for ( int j = 0; j < sides.length; j++ )
            {
                if ( i != j )
                {
                    if ( sides[i] == sides[j] )
                    {
                        counter++;
                    }
                }

            }
        }

        return counter;
    }

}
