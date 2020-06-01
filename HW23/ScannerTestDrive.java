import java.util.Scanner;

public class ScannerTestDrive { 
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);

	while (sc.hasNext()){
	    System.out.println(sc.next());
	}
    }
}