/*
Clara Mohri
APCS1 Pd8
HW#57 -- How Deep Does the Rabbit Hole Go? 
2017-12-19
*/

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;
    
    private Object[][] matrix;
    
    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    //O(1) runtime
    public Matrix( ) 
    {
	matrix = new Object[ DEFAULT_SIZE ][ DEFAULT_SIZE ];
    }
    
    
    //constructor intializes an a*a matrix
    //O(1) runtime   
    public Matrix( int a ) 
    {
	matrix = new Object[ a ][ a ];
    }
    
    
    //return size of this matrix, where size is 1 dimension
    //O(n) runtime
    private int size() 
    {
	int size = 0;
	for ( Object[] i: matrix )
	    size += 1;
	return size;
    }
    
    
    //return the item at the specified row & column   
    //O(1) runtime
    private Object get( int r, int c ) 
    {
	return matrix[ r- 1][ c- 1 ];
    }
    
    
    //return true if this matrix is empty, false otherwise
    //O(n^2) runtime
    private boolean isEmpty() 
    {
	boolean retBool = true;
	for ( Object[] r: matrix ) {
	    for (Object c: r){
		if( !(c == null))
		    retBool = false;
	    }
	}
	return retBool;
    }
    
    
    //overwrite item at specified row and column with newVal
    //return old value
    //O(1) runtime
    private Object set( int r, int c, Object newVal ) 
    {
	Object retObj = matrix[r-1][c-1];
	matrix[r-1][c-1] = newVal;
	return retObj;
    }
    
    
    //return String representation of this matrix
    // (make it look like a matrix)
    //O(n^2) runtime
    public String toString() 
    {
	String retStr = "";
	for (Object[] r: matrix){
	    for (Object c: r)
		retStr += c + "   ";
	    retStr += "\n";
	}
	return retStr;
    }
    
    
    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    //O(n^2) runtime
    public boolean equals( Object rightSide ) 
    {
	boolean retBool = true;
	if (rightSide instanceof Matrix){
	    Matrix holder = (Matrix)rightSide;
	    
	    if (size() == holder.size()){
		for (int i = 1; i <= size(); i++){
		    for (int x = 1; x <= size(); x++){
			Object one = get(x, i);
			Object two = holder.get(x, i);
			if (one != two)
			    retBool = false;
		    }
		}	    	      
	    }
	}	
	else {retBool = false;}        
	return retBool;
    }
    
    
    
    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    //O(n) runtime
    public void swapColumns( int c1, int c2  ) 
    {
	for (int i = 1; i <= size(); i++){
	    Object placeH = get(i, c1);
	    Object placeHr = get(i, c2);
	    set(i, c1, placeHr);
	    set(i, c2, placeH);
	}
    }
    
    
    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    //O(n) runtime
    public void swapRows( int r1, int r2  ) 
    {
	for (int i = 1; i <= size(); i++){
	    Object placeH = get(r1, i);
	    Object placeHr = get(r2, i);
	    set(r1, i, placeHr);
	    set(r2, i, placeH);
	}
    }
    
    
    //main method for testing
    public static void main( String[] args ) 
    {
	Matrix foo = new Matrix();
	//System.out.println(foo.size());
	//System.out.println(foo.get(1, 1));
	//System.out.println(foo.isEmpty());
	System.out.println("Initializing Matrix foo...");
	foo.set(1, 1, "hello");
	foo.set(1, 2, "there");
	foo.set(2, 1, "good");
	foo.set(2, 2, "friend");
	//System.out.println(foo.get(1, 1));
	System.out.println(foo);
	
	Matrix boo = new Matrix(2);
	//System.out.println(boo.size());
	//System.out.println(boo.get(2, 2));
	//System.out.println(boo.isEmpty());
	System.out.println("Initializing Matrix boo...");
	System.out.println(boo);
	
	Matrix hey = new Matrix(2);
	System.out.println("Initializing Matrix hey...");
	System.out.println(hey);
	
	
	System.out.print("foo.equals(boo): ");
	System.out.println(foo.equals(boo));
	System.out.print("hey.equals(boo): ");
	System.out.println(hey.equals(boo));
	
	System.out.println("\nSwapping columns 1 and 2 in foo...");
	foo.swapColumns(1, 2);
	System.out.println(foo);
	
	System.out.println("Swapping rows 1 and 2 in foo...");
	foo.swapRows(1, 2);
	System.out.println(foo);
    }

}//end class Matrix
