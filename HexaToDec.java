package practice;

	import java.util.Scanner;

	public class HexaToDec {
		public static void main(String[] args) {
	
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the Hexa Number : "); 
		  String str = in.nextLine();
		   int dec = hexaDec(str); System.out.println(dec);
		 
			//System.out.println(hexaDec("AfA3445"));
			
		}
		
		static int hexaDec(String s) {
			String digit = "0123456789ABCDEF";
			s= s.toUpperCase();
			int val=0;
			for(int i =0 ; i<s.length() ; i++) {
				char c= s.charAt(i);
				int d=digit.indexOf(c);
				val = val*2+d;
			}
			return val;
		}
		
//{
		
//		static int HexaDec(String str) {
//			int val =0;
//			for(int i=0 ; i<str.length() ; i++) {
//				char c = str.charAt(i);
//                int d = str.indexOf(c);
//                val = val + pow(16,i);
//			}
//			return val;
//			
//		}
//	static	int pow(int n , int p){
//			int pw=1;
//			while(p>0) {
//				pw= pw*n;
//				p--;
//			}
//			return pw;
//		}

	
	}

