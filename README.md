# TestExercise1-Triangle
Test Exercise 1 - Triangle

# Triangle.class

```    
public class Triangle 
{
    private int a;
    private int b;
    private int c;

    public Triangle( int a, int b, int c )
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA()
    {
        return a;
    }

    public void setA( int a )
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB( int b )
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC( int c )
    {
        this.c = c;
    }   
}
```
# TriangleController.class
```
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
```

# Main.class
```
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
```
