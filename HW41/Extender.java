public class Extender{

    public static void grow(byte[] a, int n){
	byte b[] = new byte[a.length + n];
	for (int i = 0; i < a.length; i++){
	    b[i] = a[i];
	}
    }

    public static void main(String[] args){


}