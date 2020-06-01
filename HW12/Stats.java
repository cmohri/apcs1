/*
Clara Mohri
APCS Pd08
HW12 -- stAtistically sPeaking
2017-10-05
 */

//this imports the class Math
import java.lang.Math;

//class Stats has methods that calculate certain stats about two values
public class Stats 
{
    //main function to test functionality of methods
    public static void main (String[] args)
    {
	System.out.println(mean(3, 5));//returns 4
	System.out.println(mean(3, 4));//returns 3, because 3.5 is truncated
	System.out.println(mean(3.5, 4));//returns 3.75
	System.out.println(max(10, 3));//returns 10
	System.out.println(max(3 ,3));//returns 3
	System.out.println(max(3.55, 3.50));//returns 3.55
	System.out.println(max(3.1, 3.1));//returns 3.1
	System.out.println(geoMean(4, 5));//returns 20
	System.out.println(geoMean(4.0, 5));//returns 20.0
	System.out.println(geoMean(16.1, 15.2));//returns 244.72
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

    //this method takes in two ints, and returns the max double of these two doubles
    public static double max(double a, double b){
	if (a>b)
	    {return a;}//a is retured if a is greater than b
	else
	    {return b;}//b is returned is a <b or a == b
    }

    //this method takes in two ints, and returns the geometric mean of these two ints as an int
    public static int geoMean(int a, int b){
	double asquare = Math.pow(a, 2); //double that is a squared
	double bsquare = Math.pow(b, 2); //double that is b squared
	double prod = asquare*bsquare; //double that is the product of asquare and bsquare
	double sqrt = Math.sqrt(prod); //double that is the sqrt of prod
	return (int)sqrt; //sqrt must be turned into an int 
    }

    //this method takes in two doubles, and returns the geometric mean of these two doubles as a double
    public static double geoMean(double a, double b){
	double asquare = Math.pow(a, 2);//double that is a squared
	double bsquare = Math.pow(b, 2);//double that is b squared
	double prod = asquare*bsquare;//double that is the product of asquare and bsquare
	double sqrt = Math.sqrt(prod);//double that is the sqrt of prod  
	return sqrt; //sqrt is returned
    }
	
}
