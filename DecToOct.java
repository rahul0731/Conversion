
public class DecToOct {

}
class DecToOctMethod {
	String decToOct(int dec) {
		String oct = "";
		do {
			int r = dec%8;
			oct = r +oct ;// revrese direct 
			dec = dec/8;		
		}while(dec!=0);
		return oct;
	}
}
