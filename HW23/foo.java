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
	    while ( !beginsWithVowel(lower)){
		lower = lower.substring(1, (lower.length()))
		    + lower.substring(0, 1);
		//System.out.println(lower);
	    }
	    pigL = lower + "ay";
	}

	String firstChr = w.substring(0, 1);
	if (firstChr.equals(firstChr.toUpperCase())){
	    String firstChrPig = pigL.substring(0, 1);
	    pigL = firstChrPig.toUpperCase() + pigL.substring(1, pigL.length());
	}
	return pigL;
    }