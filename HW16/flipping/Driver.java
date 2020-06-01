/*
Clara Mohri
APCS1 Pd8
HW16 -- Get It While You Can
2017-10-17
*/


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
    System.out.println("================================");

    System.out.println("Flipping wayne and yours until there is a total of five heads:\n");

    wayne.reset();
    yours.reset();
    //while there is not a total of 5 heads, wayne and yours are flipped.
    while (wayne.getHeadsCtr() + yours.getHeadsCtr() < 5){
	wayne.flip();
	yours.flip();
    }
	//wayne headsCtr printed
	System.out.print("wayne headsCtr: ");
	System.out.println(wayne.getHeadsCtr());
	//yours headsCtr printed
	System.out.print("yours headCtr: ");
	System.out.println(yours.getHeadsCtr());
	//total flips printed
	System.out.print("Total flips: ");
	System.out.println(wayne.getFlipCtr());
	System.out.println();

    System.out.println("================================");

    System.out.println("Flipping wayne and yours until there is a total of five tails:\n");
    wayne.reset();
    yours.reset();
    //while there is not a total of 5 tails, wayne and yours are flipped
    while (wayne.getTailsCtr() + yours.getTailsCtr() < 5){
	wayne.flip();
	yours.flip();

    }
	//wayne tailsCtr printed
	System.out.print("wayne tailsCtr: ");
        System.out.println(wayne.getTailsCtr());
	//yours tailsCtr printed
        System.out.print("yours tailsCtr: ");
        System.out.println(yours.getTailsCtr());
	//total flips printed
	System.out.print("Total flips: ");
	System.out.println(wayne.getFlipCtr());
	System.out.println();
    System.out.println("================================");
	    


    //establishing a ctr, as 0
    //ctr represents the amount of times that wayne and yours match
    int ctr = 0;

    //first, wayne and yours are matched 130000 times
    while (ctr != 13000){
	yours.flip();
	wayne.flip();
	if (yours.equals(wayne)){
		ctr += 1;
	    }
    }
    //then, ctr is made to be an integer divisible by 2001
    while (ctr%2001 != 0){
	yours.flip();
	wayne.flip();
	if (yours.equals(wayne)){
	    ctr += 1;
	}
    }
	    

    System.out.print("Amount of flips it takes to get 13,000 matches, and divisible by 2001: ");
    System.out.println(wayne.getFlipCtr());
    System.out.print("Amount of matches: ");
    System.out.println(ctr);
    System.out.print("Amount of matches, divided by 2001.: ");
    System.out.println(ctr/2001.);


 
    
    }//end main()

}//end class*/