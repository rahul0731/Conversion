
public class DecToHex {

}

class DecToHexMethod {
	String decToHex(int dec)
	{
		String hx = "";
		do {
			int r = dec%16;
			System.out.println(r);
			if(r<10)
				hx = r +hx ;
			else {
				switch(r) {
				case 10 : hx = 'A' +hx;
				case 11 : hx = 'B' +hx;
				case 12 : hx = 'C' +hx;
				case 13 : hx = 'D' +hx;
				case 14 : hx = 'E' +hx;
				case 15 : hx = 'F' +hx;
			
				}
				dec =dec/10;
			}
		}while(dec!=0);
		return hx;
	}
}