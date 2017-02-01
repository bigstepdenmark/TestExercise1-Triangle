/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softtestex1;

import java.util.Scanner;

/**
 *
 * @author Ismail Cam
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        int[] sides = new int[3];

        for ( int i = 0; i < sides.length; i++ )
        {
            System.out.print( "Indtast side: " );
            sides[i] = input.nextInt();
        }

        System.out.println( "================================" );
        System.out.println( "Resultat: " + new TriangleController().getTriangleType( new Triangle( sides[0], sides[1], sides[2] ) ) );
        System.out.println( "================================" );

    }

}
