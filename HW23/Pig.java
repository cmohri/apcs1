/*
Clara Mohri
APCS1 Pd8
Hw23 -- Etterbay Odingcay Oughthray Ollaborationcay
2017-10-25
*/

/*
To do list: 
Method that manages punctuation
Method that cleans up white space

As for multiple word inputs, we can use scanner to separate each word and then
translate word for word.
*/

public class Pig
{
    //initializing VOWELS here allows the instance variable to be accesible to all methods
    private static final String VOWELS = "aeiouAEIOU";


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

    //pre: w != null
    //post: firstVowel("") --> ""
    //      firstVowel("zzz") --> ""
    //      firstVowel("meatball") --> "e"
    public static String firstVowel(String w){
	int index = 0;
	String firstVowel = "";
	while (index < w.length()){
	    if (isAVowel(w.substring(index, index + 1))){
		firstVowel =  w.substring(index, index + 1);
		return firstVowel;
	    }
	    index += 1;
	}
	return firstVowel;
    }

    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w){
	return isAVowel(w.substring(0, 1));
    }

    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    public static String engToPig(String w){
	String lower = w.toLowerCase();
	String pigL = "";
	if (beginsWithVowel(lower)){
	    pigL = lower + "way";
	}
	else {
	    if (hasAVowel(w))
		{
		    while ( !beginsWithVowel(lower)){
			lower = lower.substring(1, (lower.length()))
			    + lower.substring(0, 1);
		//System.out.println(lower);
		    }
		    
		}
	    else {
		while (! lower.substring(0, 1).equals("y")){
		    lower = lower.substring(1, (lower.length()))
			+ lower.substring(0, 1);
		}
	    }
	    lower = lower + "ay";
	}
	   
	String firstChr = w.substring(0, 1);
	if (firstChr.equals(firstChr.toUpperCase())){
	    String firstChrPig = pigL.substring(0, 1);
	    pigL = firstChrPig.toUpperCase() + pigL.substring(1, pigL.length());
	}
	return pigL;
    }

    


    public static void main( String[] args ) 
    {
	/*	System.out.println("Testing hasA()");
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

	System.out.println("Testing allVowels()");
	System.out.println("allVowels('meatball')");
	System.out.println(allVowels("meatball"));
	System.out.println("allVowels('lllll')");
	System.out.println(allVowels("lllll"));
	System.out.println(allVowels("lAAA"));
	System.out.println("=======================");
*/

	System.out.println("Testing firstVowel()");
	System.out.println("firstVowel('meatball')");
	System.out.println(firstVowel("meatball"));
	System.out.println("firstVowel('')");
	System.out.println(firstVowel(""));
	System.out.println("firstVowel('zzz')");
	System.out.println(firstVowel("zzz"));
	System.out.println("firstVowel('mEAtball')");
	System.out.println(firstVowel("mEAtball"));
	System.out.println("======================="); 

	System.out.println("Testing beginsWithVowel()");
	System.out.println("beginsWithVowel('Apple')");
	System.out.println(beginsWithVowel("Apple"));
	System.out.println("beginsWithVowel('apple')");
	System.out.println(beginsWithVowel("apple"));
	System.out.println("beginsWithVowel('bagel')");
	System.out.println(beginsWithVowel("bagel"));
	System.out.println("=======================");

	System.out.println("Testing engToPig()");
	System.out.println("engToPig('Hello')");
	System.out.println(engToPig("Hello"));
	System.out.println("engToPig('apple')");
	System.out.println(engToPig("apple"));
	System.out.println("engToPig('strong')");
	System.out.println(engToPig("strong"));
	System.out.println("engToPig('java')");
	System.out.println(engToPig("java"));
	System.out.println("engToPig('Strong')");
	System.out.println(engToPig("Strong"));
	System.out.println(engToPig("sky"));
    }//end main()

}//end class Pig
