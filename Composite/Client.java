/**
 * Main application
 */
public class Client
{
    public static void main( String[] args )
    {
        CPU cpu = new CPU("i7");
        GraphicsCard gcd = new GraphicsCard("GTX 900");
        Motherboard mbd = new Motherboard("EVGA Z710 FTW");
        Bundle bnd = new Bundle("PC Building");

        bnd.add( cpu );
        bnd.add( gcd );
        bnd.add( mbd );
        bnd.add( bnd );

        System.out.println( "The net price is " + bnd.price());
    }
}