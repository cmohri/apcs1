// Clara Mohri
// APCS1 pd08
// HW45 -- In America, the Driver Sits on the Left
// 2017-12-04

/***************************
 * class SuperArray version 3.0
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 *
 * ...and now SuperArray complies with the specifications of the
 * List interface. 
 ***************************/

public class SuperArray implements List
{

  private Object[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new Object[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


    //double capacity of SuperArray
    private void expand()
    {
	Object[] temp = new Object[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }


    //accessor -- return value at specified index
    //            return error message if index is out of bounds
    public Object get( int index )
    {
	if (index < 0 || index >= _size){
	    throw new ClassCastException("index " + index +  " is out of bounds");
	}
	else{
	    return _data[index];
	}
    }
  


    //mutator -- set value at index to newVal,
    //           return old value at index
    //           return error if index is out of bounds
    public Object set( int index, Object s )
    {
	if (index < 0 || index >= _size){
	    throw new ClassCastException("index " + index +  " is out of bounds");
	}
	Object temp = _data[index];
	_data[index] = s;
	return temp;
    }


    //adds an item after the last item
    public boolean add( Object s )
    {
	add( _size, s );
	return true;
    }


    //inserts an item at index
    public void add( int index, Object s)
    {
	//first expand if necessary
	//this avoids having to throw an error message
	if ( _size >= _data.length )
	    expand();
	for( int i = _size; i > index; i-- ) {
	    _data[i] = _data[i-1]; //each slot gets value of left neighbor
	}
	_data[index] = s;
	_size++;
    }
    
    
    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    //returns removed value, or error if index is out of bounds
    public Object remove( int index )
    {
	//error message
	if (index < 0 || index >= _size){
	    throw new ClassCastException("index " + index +  " is out of bounds");
	}
	Object retObj = _data[index];
	for( int i = index; i < _size - 1; i++ ) {
	    _data[i] = _data[i+1];
	}
	_size--;
	return retObj;
    }
    
    
    //return number of meaningful items in _data
    public int size()
    {
	return _size;
    }
    
    //main method for testing
    public static void main( String[] args )
    {
	//testing ListInt interface methods
	List mayfield = new SuperArray();

	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);
	
	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);
	
	System.out.println("Printing populated ListInt mayfield...");
	System.out.println(mayfield);
	
	mayfield.remove(3);
	System.out.println("Printing ListInt mayfield post-remove...");
	System.out.println(mayfield);
	mayfield.remove(3);
	System.out.println("Printing ListInt mayfield post-remove...");
	System.out.println(mayfield);
	
	mayfield.add(3,99);
	System.out.println("Printing ListInt mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing ListInt mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing ListInt mayfield post-insert...");
	System.out.println(mayfield);
	
	System.out.println("Printing ListInt mayfield post-set...");
	System.out.println("removed: " + mayfield.set(2, "hello"));
	System.out.println(mayfield);
	System.out.println("Printing ListInt mayfield post-remove...");
	System.out.println("removed: " + mayfield.remove(2));
	System.out.println(mayfield);
	System.out.println("An error message: ");
	System.out.println(mayfield.remove(20));

    }//end main()
    
    
}//end class


