/*
Clara Mohri
APCS1 Pd8
HW#16 -- Get It While You Can
2017-10-17
*/

import java.lang.Math;

public class Coin
{
    //instance variables
    private double value;
    private String upFace;
    private String name;
    private int flipCtr ;
    private int headsCtr;
    private int tailsCtr;
    private double bias = .5;

    //default constructor
    public Coin(){
	name = "penny";
	value = 0.01;
	upFace = flip();
    }

    /*testing Math.random()
    public double randNum(){
	return  Math.random();
    }
    */

    //constructor that takes one variable, and sets this as the name 
    public Coin(String newName){
	this();
	setName(newName);
	nameToVal(name);
	upFace = flip();
    }

    //constructor that takes two variables, making them the name and upFace respectively
    public Coin(String newName, String newUpFace){
	setName(newName);
        upFace = newUpFace;
	nameToVal(name);
	upFace = flip();
    }

    //method that sets the name of a Coin
    public void setName(String newName){
	name = newName;
    }

    /*not sure flip() is working..
    public String retFace(){
	return upFace;
	}*/
    
    //assigning a value to an instance based on its name
    public void nameToVal(String name){
	if (name == "penny"){value = 0.01;}
	if (name == "nickel"){value = 0.05;}
	if (name == "dime"){value = 0.1;}
	if (name == "quarter"){value = 0.25;}
	if (name == "dollar"){value = 1.;}
    }

    //toString() method 
    public String toString(){
	return name + "-- " + upFace ;
     }

    //flips a coin and randomly assigns heads or tails
    public String flip(){
	flipCtr += 1; //flipCtr increases by 1
	if (Math.random() < bias){
	    tailsCtr += 1; //tailsCtr increases by 1
	    upFace = "tails";
	}
	else {
	    headsCtr += 1;//else, headsCtr increases by 1
	    upFace = "heads";
	}
	return upFace;
    }

    //returns whether two upFaces are equal from different instances
    public boolean equals(Coin other){
	return upFace == other.upFace;
    }

    //accessor functions: 
    public int getHeadsCtr(){
	return headsCtr;
    }

    public int getFlipCtr(){
	return flipCtr;
    }

    public int getTailsCtr(){
	return tailsCtr;
    }

    //rest resets the counters
    public void reset(){
	tailsCtr = 0;
	headsCtr = 0;
	flipCtr = 0;
    }
}