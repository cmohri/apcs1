/*
Clara Mohri
APCS1 Pd8
HW#38 -- Put It Together
2017-12-21
*/

/**
Java class Swapper creates a 2D array of unique 3- or 4-character Strings and display it in the terminal. It will then prompt the user to specify two locations, swap the items at these locations, and redisplay the array.
**/

import cs1.Keyboard;

public class Swapper{

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //attribute array is an array of three and four characterer strings
    public String[][] array = {{"yes", "june", "july"},
			       { "may", "218", "518"},
			       {"noo", "foo", "bar"},
			       {"cla", "ra", "moh"}};;

    //toString method returns a String representation of the array
    public String toString(){
	String retStr = "  0    1    2\n";
	int ycor = 0;
	for (String[] x: array){
	    retStr += ycor + " ";
	    ycor += 1;
	    for (String i: x){
		retStr += i + " ";
	    }
	    retStr += "\n";
	}
	return retStr;
    }

    //swap method takes two ints: x- and y-cors for the strings to be swapped
    //swaps these two strings within the array
    public void swap(int x, int y, int a, int b){
	String place = array[a][b];
	array[a][b] = array[x][y];
	array[x][y] = place;
    }

    public String findStr(int x, int y){
	return array[y][x];
    }

    public static void main(String[] args){
	System.out.println(ANSI_RED + "red" + ANSI_RESET);

	Swapper a = new Swapper();
	System.out.println(a);
	//a.swap(2, 1, 1, 2);
	//System.out.println(a);
	int xcor1 = 20;
	int ycor1 = 20;
	int xcor2 = 20;
	int ycor2 = 20;
    

	String msg = "To swap the location of two strings, specify the locations of the two strings to be swapped. \nAn xcor must be between 0 and 2 inclusive.\nA ycor must be between 0 and 3 inclusive.";
	System.out.println(msg);
	
	//locations of the two strings to be swapped are specified
	while (xcor1 < 0 || xcor1 > 2){
	    System.out.print("xcor of first: ");
	    xcor1 = (Keyboard.readInt());
	}
	
	while (ycor1 < 0 || ycor1 > 3){
	    System.out.print("ycor of first: ");
	    ycor1 = Keyboard.readInt();
	}
	

	while (xcor2 < 0 || xcor2 > 2){
	    System.out.print("xcor of second: ");
	    xcor2 = Keyboard.readInt();
	}

	while (ycor2 < 0 || ycor2 > 3){
	    System.out.print("ycor of second: ");
	    ycor2 = Keyboard.readInt();
	}
     
	System.out.print("\nSwitching ");
	System.out.print(a.findStr(xcor1, ycor1)); 
	System.out.print(" with ");
	System.out.println(a.findStr(xcor2, ycor2));

	//the two strings are swapped: 	
	a.swap(ycor1, xcor1, ycor2, xcor2);
	//array is printed out again: 
	System.out.println("\n" + a);

    }
}