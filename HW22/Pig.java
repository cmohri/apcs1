/*
Clara Mohri
APCS1 Pd8
Hw22 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
2017-10-24
*/

public class Pig
{
    //initializing VOWELS here allows the instance variable to be accesible to all methods
    private static final String VOWELS = "aeiou";


    /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	return w.indexOf(letter) >= 0;
    }//end hasA()

    
    /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	return VOWELS.indexOf(letter) >= 0;
    }


    /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
    public static int countVowels( String w ) 
    {
	int vowelCnt = 0;
	for (int x = 0; x < w.length(); x+= 1){
	    String letter = w.substring(x, x+1);
	    if (isAVowel(letter)){
		vowelCnt += 1;
	    }
	}
	return vowelCnt;
    }


    /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	/*	int index = 0;
	int length = w.length();
	int vowelCnt = 0;
	while (index < length && vowelCnt == 0){
	if (*/
	return countVowels(w) > 0;
    }


    /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
    public static String allVowels( String w ) 
    {
	String retStr = "";
	for (int x= 0; x < w.length(); x += 1){
	    String letter = w.substring(x, x+1);
	    if (isAVowel(letter)){
		retStr += letter;
	    }
	}
	return retStr; 
    }


    public static void main( String[] args ) 
    {
	System.out.println("Testing hasA()");
	System.out.println("hasA('hello', 'h')");
	System.out.println(hasA("hello", "h"));
	System.out.println("hasA('hello', 'a')");
	System.out.println(hasA("hello", "a"));
	System.out.println("=======================");

	System.out.println("Testing isAVowel()");
	System.out.println("isAVowel('a')");
	System.out.println(isAVowel("a"));
	System.out.println("isAVowel('c')");
	System.out.println(isAVowel("c"));
	System.out.println("=======================");

	System.out.println("Testing countVowels()");
	System.out.println("countVowels('meatballs')");
	System.out.println(countVowels("meatballs"));
	System.out.println("countVowels('aaa')");
	System.out.println(countVowels("aaa"));
	System.out.println("countVowels('v')");
	System.out.println(countVowels("v"));
	System.out.println("=======================");

	System.out.println("Testing hasAVowel()");
	System.out.println("hasAVowel('hello')");
	System.out.println(hasAVowel("hello"));
	System.out.println("hasAVowel('yyy')");
	System.out.println(hasAVowel("yyy"));
	System.out.println("=======================");

	System.out.println("Testing allVowel()");
	System.out.println("allVowels('meatball')");
	System.out.println(allVowels("meatball"));
	System.out.println("allVowels('lllll')");
	System.out.println(allVowels("lllll"));
    }//end main()

}//end class Pig
