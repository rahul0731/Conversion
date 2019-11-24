import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int dec = binToDec(num);
		System.out.println(dec);
		
	}



	static int binToDec(int bin) {
		int dec=0 , p=0;
		do {
			int r = bin%10;
			dec = dec + r * pow(2,p);
			bin = bin/10;
			p++;
		}while(bin!=0);
		return dec;
	}
	
	static int pow(int n, int p){
		int pw =1;
		while(p>0){
			pw = pw *n;
			p--;	
		}
	return pw;
	}
	
}
