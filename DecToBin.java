import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String bin = decToBin(num);
		System.out.println(bin);
	}


	static String decToBin(int dec) {         
		String bin = "";
		
		do {
			int r = dec%2;
			bin = r +bin;          // or bin = bin*10 + r; and then reverse.
			dec = dec/2;
			
		}while(dec!=0);
		return bin ;
	}
}
