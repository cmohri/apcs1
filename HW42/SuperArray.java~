// Clara Mohri
// APCS1 pd08
// HW42 -- expanding SuperArray functionality, encapsulation
// 2017-11-29w

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{
    
    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray
    
    
    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new int[10];
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
    
    //output entire _data
    private String fullArr(){
	String retStr = "[";
	for (int x = 0; x < _data.length - 1;  x+= 1){
	    retStr += _data[x] + ", ";
	}
	retStr += _data[_data.length-1];
	retStr += "]";
	return retStr;
    }


    //double capacity of SuperArray
    private void expand()
    {
	int[] temp = new int[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }
    
    
    //accessor -- return value at specified index
    public int get( int index )
    {
	return _data[index];
    }
    

    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
	int temp = _data[index];
	_data[index] = newVal;
	return temp;
    }
    
    
    //adds an item after the last item
    public void add( int newVal )
    {
	if (_size == _data.length){
	    System.out.println("No more space in this array");
	}
	else{
	    _data[_size] = newVal;
	    _size += 1;
	}
    }

    
    //inserts an item at index
    public void add( int index, int newVal )
    {      
	System.out.println(_data.length);
	if (index >= _data.length){
	    System.out.println("Index out of range");
	}

	else{
	    _data[index] = newVal;
	    if (index >= _size){
		_size = index + 1;
	    }
	}
    }
    
    
    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove( int index )
    {
	if (index >= _data.length){
	    System.out.println("index out of range");
	}
	else{
	    _data[index] = 0;
	    for (int x = index+1; x< _data.length; x += 1){
		_data[x-1] = _data[x];
		// System.out.println(this.fullArr());
	    }
	    _data[_data.length - 1] = 0;
	    _size -= 1;
	}
    }
    
    
    //return number of meaningful items in _data
    public int size()
    {
	return _size;
    }
    
    

    //main method for testing
    public static void main( String[] args )
    {
	
	SuperArray curtis = new SuperArray();
	System.out.println( "Printing empty SuperArray curtis..." );
	System.out.println( curtis );
	
	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set( i, i * 2 );
	}
	
	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);
	
	for( int i = 0; i < 3; i++ ) {
	    curtis.expand();
	    System.out.println("Printing expanded SuperArray curtis...");
	    System.out.println(curtis);
	    System.out.println("new length of underlying array: "
			       + curtis._data.length );
	}
	
	SuperArray mayfield = new SuperArray();
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);
	System.out.println("Size: " + mayfield.size());

	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);
	
	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);
	System.out.println("Size: " + mayfield.size());
	
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	//	System.out.println(mayfield.fullArr());
	System.out.println("Size: " + mayfield.size());

	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	System.out.println("Size: " + mayfield.size());
	
	
	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	System.out.println("Size: " + mayfield.size());
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	System.out.println("Size: " + mayfield.size());
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	System.out.println("Size: " + mayfield.size());
    
	mayfield.add(20, 77);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
	//	System.out.println(mayfield.fullArr());
	System.out.println("Size: " + mayfield.size());



    }//end main()
    
    
}//end class
