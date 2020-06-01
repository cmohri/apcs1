/*
Clara Mohri
APCS1 Pd8
HW36 -- Be Rational
2017-11-19
*/

public class Rational{
   
    //instance variables
    private int p;
    private int q;

    //default constructor
    public Rational(){
	p = 0;
	q = 1;
    }

    //overloaded constructor
    public Rational(int num, int den){
	p = num;
	q = den;
    }

    //toString method returns String representation of rational number
    public String toString(){
	String retStr = "";
	retStr += p;
	retStr += "/";
	retStr += q;
	return retStr;
    }

    //floatValue method returns floating point value of rational number
    public double floatValue(){
	double num = (double)p;
	double den = (double)q;
	return num/den;
    }

    //method that returns p attribute of a Rational
    public int getNum(){
	return p;
    }

    //method that reutrns q attribute of a Rational
    public int getDen(){
	return q;
    }


    //multiply method multiplies rational number by another rational number
    //changes attributes
    public void multiply(Rational s){
	p *= s.getNum();
	q *= s.getDen();
    }

    //divide method multiplies rational number by another rational number
    //changes attributes
    public void divide(Rational s){
	int num = s.getDen();
	int den = s.getNum();
	p *= num;
	q *= den;
    }

    public static void main(String[] args){
	Rational number = new Rational();
	System.out.println("number: " + number);
	System.out.println("float value: " + number.floatValue());

	Rational myNum = new Rational(3, 6);
	System.out.println("myNum: " + myNum);
	System.out.println("float value: " +myNum.floatValue());

	Rational otherNum = new Rational(4, 5);
	System.out.println("otherNum: " + otherNum);
	System.out.println("float value: " +otherNum.floatValue());

      
	otherNum.multiply(myNum);
	System.out.println("otherNum.multiply(myNum)");
	System.out.println("otherNum: " + otherNum);

	otherNum.divide(number);
	System.out.println("otherNum.divide(number)");
	System.out.println(otherNum);

    }


}

