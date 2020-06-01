public class Array{

    public static void main(String[] args){
	int[][][] arr = new int[2][2][3];

	String retStr = "";
	retStr += "[";
	for (int[][] x: arr){
	    retStr += "[";
	    for (int[] i: x){
		retStr += "[";
		for (int a: i){
		    retStr += a + " ";
		}
		retStr += "]";
	    }
	    retStr += "]";
	}
	retStr += "]";
    System.out.println(retStr);
    }
}