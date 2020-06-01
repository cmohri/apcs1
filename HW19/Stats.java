/*
Team Wenting/Clara
Clara Mohri
APCS Pd08
HW18 -- gcd 3 ways
2017-10-19
 */

//this imports the class Math
import java.lang.Math;

//class Stats has methods that calculate certain stats about two values
public class Stats 
{
    //main function to test functionality of methods
    public static void main (String[] args)
    {
	System.out.println("testing mean");
	System.out.println(mean(3, 5));//returns 4
	System.out.println(mean(3, 4));//returns 3, because 3.5 is truncated
	System.out.println(mean(3.5, 4));//returns 3.75
	System.out.println("=========\n");
	System.out.println("testing max");
	System.out.println(max(10, 3));//returns 10
	System.out.println(max(3 ,3));//returns 3
	System.out.println(max(3.55, 3.50));//returns 3.55
	System.out.println(max(3.1, 3.1));//returns 3.1
	System.out.println(max(1, 2, 3));
	System.out.println(max(3.4, 4.5, 6.6));
	System.out.println("=========\n");
	System.out.println("testing geoMean");
	System.out.println(geoMean(4, 5));//returns 4
	System.out.println(geoMean(4.0, 5));//returns 4.4...
	System.out.println(geoMean(16.1, 15.2));//returns 15.64...
	System.out.println(geoMean(16, 15, 13));//returns 14
	System.out.println(geoMean(16.1, 15.2, 13.1));//returns 14.751
	System.out.println(geoMean(-1, -2, -10));//returns 0
	System.out.println(geoMean(-1, -2, 10));//returns 2
	System.out.println("=========\n");
	System.out.println("testing gcd()");
	System.out.println(gcd(15, 20));
	System.out.println(gcd(0, 20));
	System.out.println(gcd(1, 20));
	System.out.println(gcd(5, 5));
	System.out.println("=========\n");
	System.out.println("testing gcdER()");
	System.out.println(gcdER(15, 20));
	System.out.println(gcdER(0, 20));
        System.out.println(gcdER(1, 20));
	System.out.println(gcdER(5, 5));
	System.out.println("=========\n");
        System.out.println("testing gcdEW()");
	System.out.println(gcdEW(15, 20));
	System.out.println(gcdEW(0, 20));
        System.out.println(gcdEW(1, 20));
	System.out.println(gcdEW(5, 5));
    }

    //this method takes in two ints and returns the mean of these two ints, as an int
    public static int mean(int a, int b){
	return ((a+b)/2);
    }

    //this method takes in two doubles, and returns the mean of these two doubles as a double
    public static double mean(double a, double b){
	return ((a+b)/2);
    }

    //this method takes in two ints, and returns the max int of these two ints
    public static int max(int a, int b){
	if (a>b) 
	    {return a;}//a is returned if a is greater than b
	else 
	    {return b;}//b is returned if a<b or a == b
    }

    //this method takes in two ints and returns the min int of the two
    public static int min(int a, int b){
	if (a<b)
	    {return a;}
	else 
	    {return b;}
    }

    //this method takes in two ints, and returns the max double of these two doubles
    public static double max(double a, double b){
	if (a>b)
	    {return a;}//a is retured if a is greater than b
	else
	    {return b;}//b is returned is a <b or a == b
    }

    //this method takes in three ints and returns the max of all three
    public static int max(int a, int b, int c){
	return max(max(a, b), c);
    }

    //this method takes in three doubles and returns the max
    public static double max(double a, double b, double c){
	return max(max(a, b ), c);
    }

    //this method takes in two ints, and returns the geometric mean of these two ints as an int
    public static int geoMean(int a, int b){
	double prod = a*b; //double that is the product of a and b
	double sqrt = Math.sqrt(prod); //double that is the sqrt of prod
	return (int)sqrt; //sqrt must be turned into an int 
    }

    //this method takes in two doubles, and returns the geometric mean of these two doubles as a double
    public static double geoMean(double a, double b){
	double prod = a*b;//double that is the product of a and b
	double sqrt = Math.sqrt(prod);//double that is the sqrt of prod  
	return sqrt; //sqrt is returned
    }

    //this method takes in three ints and returns the geoMean
    public static int geoMean(int a, int b, int c){
	int prod = a*b*c;//double that is the product of a, b, and c 
	double cubert = Math.pow(prod, (1./3)); //cubert is the cube root of prod
	return (int)cubert; //cubert is returned as an int
    }

    //this method takes in three doubles and returns the geoMean
    public static double geoMean(double a, double b, double c){
	double prod = a*b*c;//double that is the product of a, b, and c 
	double cubert = Math.pow(prod, (1./3));//cubert is the cube root of prod 
	return cubert;//cubert is returned
    }
   


    //this method uses brute-force algorithm starting at 1 and working its way up to the minimum of the two inputs to find the GCD.
    public static int gcd(int a, int b){
	int ctr = 1; //ctr initialized
	int gcd= 0; //gcd initialized 
	int min;
	//min initialized:
	if (a < b){
	    min = a;
	}
	else{
	    min = b;
	}
	//ctr works up to min
	while (ctr <= min){
	    //if ctr divides both a and b, ctr becomes the new gcd
	    if (a%ctr == 0 && b%ctr == 0){
		gcd = ctr;
	    }
	    ctr += 1;
	}
	return gcd;
    }


    /*
    This method uses Euclid's algorithm to find GCD recursively. 
    First, the larger and smaller inputs are identified.
    If either is equal to 0, then 0 is returned.
    If large is divisible by small, then small is returned
    Otherwise, large becomes larges - small and the gcdER of these two integers is called.
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

    /*
    This method uses EUclid's algorithm to find GCD iteratively with a while loop.
    First, the large and small ints are identified. 
    gcd is initialized as 0.
    While neither of these are equal to 0, first the loop makes sure that the variable names large and small are assigned correctly. 
    If large is divisible by small, gcd is set to small. 
    If not, then the value of large is set to large - small. If neither is equal to zero, the while loop starts over again.
    At the end, gcd is returned.
     */
    public static int gcdEW(int a, int b){
	int large = max(a, b);
	int small = min(a, b);
	int gcd = 0;
	while (large != 0 && small!= 0){
	    if (large < small){
		int s = small;
		small = large;
		large = s;}
	    if (large%small == 0){
		gcd =  small;

		small = 0;}
	    else {
		large = large - small;
	    }
	}
	return gcd;
    }
	    
}
