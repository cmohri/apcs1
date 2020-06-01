import java.util.ArrayList;

public class Test{

    public static int findLongest(int target) {
	int[] nums = {7 , 10 , 10 , 15 , 15 , 15 , 15 , 10 , 10 , 10 , 15 , 10 , 10};
	int lenCount = 0;
	int maxLen = 0;
	for(int val:nums) {
	    if (val == target)
		{
		    lenCount++;
		} else
		{
		    if (lenCount > maxLen)
			{
			    maxLen = lenCount;
			    lenCount = 0;
			} }
	}
	if (lenCount > maxLen)
	    {
		maxLen = lenCount;
	    }
	return maxLen;
	
    }  
    public static void main (String[] args){
	System.out.println(findLongest(10));
    }
}