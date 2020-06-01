/*
Clara Mohri
APCS1 Pd8
2017-12-06
HW#48 -- Keep Guessing
*/

/***==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================***/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
	_lo = a;
	_hi = b;
	_guessCtr = 1;
	_target = (int)(Math.random() * (_hi - _lo + 1) + _lo);
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre: User is given a range from which to guess _target
      post: _target is found, and user is returned amount of guesses it took
      ==================================================*/
    public void playIter() 
    {
	System.out.print("Guess a number from " + _lo + "-" + _hi + ": ");
	int input = Keyboard.readInt();
	while (input != _target){
	    //if the user inputs an int that is out of range, then nothing changes
	    if (input < _lo || input > _hi){
		System.out.println("Input out of bounds, try again...");
	    }
	    //upper bound becomes input-1 if input > target
	    else if (input > _target){
		System.out.println("Too high, try again...");
		_hi = input -1;
	    }
	    //lower bound becomes input + 1 if input < target
	    else{
		System.out.println("Too low, try again...");
		_lo = input + 1;
	    }
	    System.out.print("Guess a number from " + _lo + "-" + _hi + ": ");
	    _guessCtr += 1;
	    input = Keyboard.readInt();
	}
	System.out.println("Correct! It took " + _guessCtr + " guesses.");

    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre: User is given a range from which to guess _target            
      post: _target is found, and user is returned amount of guesses it took 
      ==================================================*/
    public void playRec() 
    {
	System.out.print("Guess a number from " + _lo + "-" + _hi + ": ");
	int input = Keyboard.readInt();

	if (input == _target)
	    System.out.println("Correct! It took " + _guessCtr + " guesses.");

	else{
	    if (input < _lo || input > _hi){
		System.out.println("Input out of bounds, try again...");
		playRec();
	    }
	    else if (input > _target){
                System.out.println("Too high, try again...");
                _hi = input -1;
		_guessCtr += 1;
		playRec();
            }
	    else{
		System.out.println("Too low, try again...");
		_lo = input + 1;
		_guessCtr += 1;
		playRec();
	    }
	}
    }
    

    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	//playRec();
	playRec();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();

    }//end main

}//end class
