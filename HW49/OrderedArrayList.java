/*
Clara Mohri
APCS1 pd 8
2017-12-07
HW#49 -- Halving the Halves
*/

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Comparable 
  // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;
    

  // default constructor initializes instance variable _data
  public OrderedArrayList()
  {
    _data = new ArrayList<Comparable>();    
  }


  public String toString()
  {
    return _data.toString(); 
  }


  public Comparable remove( int index )
  {	
    return _data.remove(index); 
  }


  public int size()
  { 
    return _data.size();
  }

    
  public Comparable get( int index )
  { 
    return _data.get(index); 
  }


    /***
   * add takes as input any comparable object 
   * (i.e., any object of a class implementing interface Comparable)
   * inserts newVal at the appropriate index
   * index is found by calling the helper method
   ***/
    public void addBin( Comparable newVal )
    {	
	int hi = _data.size();
	int lo = 0;
	int index = helper(newVal, hi, lo); //calling helper method
	_data.add(index, newVal);
    }

    //this wrapper method takes in three args, and recursively finds the 
    //correct index for newVal using a binary search
    public int helper(Comparable newVal, int hi, int lo){
	if (hi == lo)
	    return hi;
	else if (hi - lo == 1){
	    if (newVal.compareTo(_data.get(lo)) > 0)
		return hi;
	    else return lo;
	}
	else {
	    int med = (hi + lo) / 2;
		if (newVal.compareTo(_data.get(med)) >= 0){
		    lo = med;		
		}
	    else{
		hi = med;
	    }
	    return helper(newVal, hi, lo);
	}
		
    }


  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();
    
    // testing linear search
    for( int i = 0; i < 15; i++ )
	Franz.addBin( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    
    //check for sorted-ness
    //if msg does not appear, list was sorted
    for( int i=0; i<Franz.size()-1; i++ ) {
	System.out.println("at i: " + Franz.get(i) );
	if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
	    System.out.println( " *** NOT sorted *** " );
	    break;
	}

	}
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()
  
}//end class OrderedArrayList
