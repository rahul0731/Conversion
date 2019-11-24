import java.util.Scanner;

public class OctToDec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Octal Number : ");
		int num = in.nextInt();
		OctToDecMethod od = new OctToDecMethod();
		System.out.println(od.octToDec(num));
	}

}

class OctToDecMethod {
	int octToDec(int oct) {
		int dec =0 , p=0;
		do {
			int r = oct%10;
			dec = dec +r* pow(8,p);
			p++;
			oct = oct/10;
		}while(oct != 0);
		return dec;
	}
	int pow(int n, int p){
		int pw =1;
		while(p>0){
			pw = pw *n;
			p--;	
		}
	return pw;
	}
	
	
}
