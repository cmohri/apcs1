public class Driver
{
    public static void main( String[] args )
    {

	//build Objects from blueprint specified by class Coin

	//test default constructor

    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    Coin test = new Coin("dollar", "heads");
    System.out.println(test.equals(wayne));

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
    //System.out.println(yours.randNum());
    //        System.out.println(yours.flip());

    //System.out.println(yours.equals(wayne));

    //System.out.println(yours.equals(wayne));

   
    //test equals() method
    if ( yours.equals(wayne) ) 
	{ System.out.println( "Matchee matchee!" );}
    else
	{ System.out.println( "No match. Firestarter you can not be." );}

    /* ====================BOTTOM======================*/

    }//end main()

}//end class