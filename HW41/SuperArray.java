/*
Clara Mohri
APCS1 Pd8
2017-11-27
HW#41
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _data = new int[10];
      _size = 10;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
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
      //_data is stored in a placeholder array
      int[] placeH = _data;
      //_data is redefined to have twice the capacity
      _data = new int[_size*2];
      //the items from the placeholder are copied into _data
      for (int x = 0; x < _size; x+= 1){
	  _data[x] = placeH[x];
      }
      //inst var _size is doubled as well
      _size *= 2;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      int num = _data[index];
      return num;
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int placeH = _data[index];
      _data[index] = newVal;
      return placeH;
  }


  //main method for testing
  public static void main( String[] args )
  {

      //creates new SuperArray
      SuperArray curtis = new SuperArray();
      //through the default constructor, _data is a list of 10 zeroes
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      
      //populates curtis with other ints:
      for( int i = 0; i < curtis._data.length; i++ ) {
	  curtis.set( i, i * 2 );
      }
      //prints populated curtis out
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      //expands curtis three times:
      for( int i = 0; i < 3; i++ ) {
	  curtis.expand();
	  System.out.println("Printing expanded SuperArray curtis...");
	  System.out.println(curtis);
	  System.out.println("size: " + curtis._size);
      }

  }//end main()


}//end class
