/*
Team December is the best
Clara Mohri and Shruthi Venkata
APCS1 Pd8
HW #44: Rational Equality
2017-11-30
*/

public class Rational implements Comparable
{
    //   Instance variables for the numerator and denominator
    private int _numerator;
    private int _denominator;
    
    
    // Default constructor (no parameters)
    // creates a new Rational with the value of 0/1
    public Rational()
    {
	_numerator = 0;
	_denominator = 1;
    }
    
    
    // Constructor
    // takes 2 parameters, one for the numerator, one for the denominator
    // if an invalid denominator is attempted, should print a message and set the number to 0/1
    public Rational( int n, int d )
    {
	this();
	if ( d != 0 ) {
	    _numerator = n;
	    _denominator = d;
	}
	else {
	    System.out.println( "Invalid number. " +
				"Denominator set to 1." );
	}
    }
    
    
    // toString
    // returns a string representation of the rational number (formatting of your choice)
    public String toString()
    {
	return _numerator + " / " + _denominator;
    }
    
    
    // floatValue
    // returns floating point approximation of the number
    // uses the most precise floating point primitive
    public double floatValue()
    {
	return (double)_numerator / _denominator;
    }
    
    
    // multiply
    // takes 1 Rational object as a parameter and multiplies it by this Rational object
    // does not return any value
    // should modify this object and leave the parameter alone (see below for example)
    // need not reduce the fraction
    public void multiply( Rational r )
    {
	_numerator   = this._numerator   * r._numerator;
	_denominator = this._denominator * r._denominator;
    }
    
    
    // divide
    // works the same as multiply, except the operation is division
    public void divide( Rational r )
    {
	if ( r._numerator != 0 ) {
	    _numerator   = _numerator   * r._denominator;
	    _denominator = _denominator * r._numerator;
	}
	else {
	    System.out.println( "Div by 0 error. Values unchanged." );
	}
    }
    
    // method returns the max of two ints
    public static int max(int a, int b){
	if (a > b){
	    return a;
	}
	else{ return b;}
    }

    //method returns the min of two ints
    public static int min(int a, int b){
	if (a<b){
	    return a;
	}
	else {return b;}
    }

    /*
      Euclid's algo for finding the GCD:
      First, the larger and smaller inputs are identified.                        
      If either is equal to 0, then 0 is returned.                                
      If large is divisible by small, then small is returned                      
      Otherwise, large becomes larges - small and the gcdER of these two integers \
      is called.                                                                     
    */
    public static int gcdER(int a, int b){
        int large = max(a, b);
        int small = min(a, b);
        if (small == 0){
            return 0;
        }
	
        if (large %small == 0){
            return small;}
        else {
            large = large - small;
            return gcdER(large, small);
        }
    }

    //method adds takes 1 Rational object (just like multiply)
    //and adds it to the current rational number object
    //reduces
    public void add(Rational s){
	_numerator = s._denominator*this._numerator + this._denominator*s._numerator;
	_denominator = s._denominator*this._denominator;
	this.reduce();
    }

    //method subtracts s to Rational
    //Works the same as add, except the operation is subtraction
    //reduces
    public void subtract(Rational s){
        _numerator = s._denominator*this._numerator - this._denominator*s._numerator;
        _denominator = s._denominator*this._denominator;
	this.reduce();
    }

    //returns the gcd of the numerator and the denominator
    //uses static method gcdER(int a, int b)
    public int gcd(){
	return gcdER(_numerator, _denominator);
    }

    //method reduce() 
    //changes this Rational to one in reduced form, using gcd()
    public void reduce(){
	int GCD = this.gcd();
	_numerator /= GCD;
	_denominator /= GCD;
    }    

    //method compareTo(Rational s)
    //Returns 0 if the two numbers are equal
    //Returns a positive integer if the calling number is larger than the parameter
    //Returns a negative integer if the calling number is smaller than the parameter
    public int compareTo(Rational s){
	int num1 = _numerator * s._denominator;
	int num2 = s._numerator * _denominator;
	return num1 - num2;
    }
    
    //equals method overrides equals method from Comparable interface
    //takes an Object as input
    //returns true if insput is of class Rational and of equal value to calling instance of Rational
    //returns false otherwise
    public boolean equals(Object s){
	boolean retBool = false;
	boolean isRational = (s instanceof Rational);
	if (isRational){
	    retBool =  (this.compareTo((Rational)s) == 0);
	}
	return retBool;
    }

  //main method for testing
  public static void main(String[] args)
  {
    Rational r = new Rational( 3, 7 );
    Rational s = new Rational();
    Rational t = new Rational( 8, 5 );

    Rational u = new Rational( 1, 2 );
    Rational v = new Rational( 2, 4 );
    Rational w = new Rational( 8, 12 );

    String str = "hello";
    boolean bool = true;
    double num = 0.5;

    System.out.println("str: " + str);
    System.out.println("bool: " + bool);
    System.out.println("num: " + 0.5);
    System.out.println("u: " + u);
    System.out.println("v: " + v);
    System.out.println("w: " + w + "\n");

    System.out.println("u.equals(str): ");
    System.out.println(u.equals(str));
    System.out.println("u.equals(bool): ");
    System.out.println(u.equals(bool));
    System.out.println("u.equals(v): ");
    System.out.println(u.equals(v));
    System.out.println("u.equals(w): ");
    System.out.println(u.equals(w));
    System.out.println("v.equals(num): ");
    System.out.println(v.equals(num));

    System.out.println(str.equals(v));

    /*
    System.out.println("r: " + r );
    System.out.println("s: " +  s );
    System.out.println("t: " +  t );

    System.out.println( r + " represented as a floating pt num: "
                        + r.floatValue() );

    System.out.print( r + " * " + t + " = ");
    r.multiply(t);
    System.out.println(r);

    System.out.print( r + " / " + t + " = ");
    r.divide(t);
    System.out.println(r);

    System.out.println("t: " + t);
    System.out.println("v: " + v);
    t.subtract(v);
    v.add(t);
    System.out.println("t - v: " + t);
    System.out.println("v + t: " + v);

    Rational a = new Rational (15, 20);
    System.out.println("a: " + a);
    a.reduce();
    System.out.println("reduced a: " + a);

    System.out.println("t: " + t);
    System.out.println("a compared to t: "  + a.compareTo(t));
    */
    

  }
}//end class
